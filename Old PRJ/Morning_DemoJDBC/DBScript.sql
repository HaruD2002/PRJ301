USE [Test]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 4/18/2022 10:36:24 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
	[displayname] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 4/18/2022 10:36:24 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[ccontent] [varchar](150) NOT NULL,
	[pid] [int] NOT NULL,
	[username] [varchar](150) NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Post]    Script Date: 4/18/2022 10:36:24 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Post](
	[pid] [int] NOT NULL,
	[pcontent] [varchar](150) NOT NULL,
	[username] [varchar](150) NULL,
 CONSTRAINT [PK_Post] PRIMARY KEY CLUSTERED 
(
	[pid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([username], [password], [displayname]) VALUES (N'mra', N'mra', N'DisplayName of A')
INSERT [dbo].[Account] ([username], [password], [displayname]) VALUES (N'mrb', N'mrb', N'DisplayName of B')
INSERT [dbo].[Account] ([username], [password], [displayname]) VALUES (N'mrc', N'mrc', N'DisplayName of C')
INSERT [dbo].[Account] ([username], [password], [displayname]) VALUES (N'mrd', N'mrd', N'DisplayName of D')
GO
SET IDENTITY_INSERT [dbo].[Comment] ON 

INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1, N'Comment 1 Post 1', 1, N'mra')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (2, N'Comment 2 Post 1', 1, N'mra')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (3, N'Comment 1 Post 2', 2, N'mrb')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (4, N'Comment 3 Post 1', 1, N'mrc')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (5, N'Comment 2 Post 2', 2, N'mrc')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (6, N'Comment 1 Post 3', 3, N'mrd')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1002, N'post xxxxx', 1, N'mrd')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1003, N'post xxxxx', 1, N'mrd')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1004, N'post xxxxx', 2, N'mrd')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1005, N'post xxxxx', 3, N'mrd')
INSERT [dbo].[Comment] ([cid], [ccontent], [pid], [username]) VALUES (1006, N'post xxxxx', 4, N'mrd')
SET IDENTITY_INSERT [dbo].[Comment] OFF
GO
INSERT [dbo].[Post] ([pid], [pcontent], [username]) VALUES (1, N'Post 1', N'mra')
INSERT [dbo].[Post] ([pid], [pcontent], [username]) VALUES (2, N'Post 2', N'mrb')
INSERT [dbo].[Post] ([pid], [pcontent], [username]) VALUES (3, N'Post 3', N'mrc')
INSERT [dbo].[Post] ([pid], [pcontent], [username]) VALUES (4, N'Post 4', N'mrd')
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Account]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Post] FOREIGN KEY([pid])
REFERENCES [dbo].[Post] ([pid])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Post]
GO
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_Post_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_Post_Account]
GO
