USE [PRJ301_Test_Morning]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 12/1/2022 10:28:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[userid] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
	[displayname] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[userid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 12/1/2022 10:28:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[ctitle] [varchar](150) NOT NULL,
	[userid] [varchar](150) NOT NULL,
	[tid] [int] NOT NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 12/1/2022 10:28:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](150) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [bit] NOT NULL,
 CONSTRAINT [PK_Student] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thread]    Script Date: 12/1/2022 10:28:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thread](
	[tid] [int] IDENTITY(1,1) NOT NULL,
	[tcontent] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Thread] PRIMARY KEY CLUSTERED 
(
	[tid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mra', N'mra', N'Ngo Tung Son')
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mrb', N'mrb', N'Nguyen Nhu Quynh')
INSERT [dbo].[Account] ([userid], [password], [displayname]) VALUES (N'mrc', N'mrc', N'Pham Thi Ngoc Huyen')
GO
SET IDENTITY_INSERT [dbo].[Comment] ON 

INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (1, N'Comment 1 - Thread 1', N'mra', 1)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (2, N'Comment 2 - Thread 1', N'mrb', 1)
INSERT [dbo].[Comment] ([cid], [ctitle], [userid], [tid]) VALUES (3, N'Comment 1 - Thread 2', N'mra', 2)
SET IDENTITY_INSERT [dbo].[Comment] OFF
GO
SET IDENTITY_INSERT [dbo].[Student] ON 

INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (1, N'Pham Thi Ngoc Huyen', CAST(N'2002-03-28' AS Date), 0)
INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (2, N'Nguyen Nhu Quynh', CAST(N'2000-11-20' AS Date), 0)
INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (3, N'Ngo Tung Son', CAST(N'1997-11-13' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Student] OFF
GO
SET IDENTITY_INSERT [dbo].[Thread] ON 

INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (1, N'Thread 1')
INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (2, N'Thread 2')
INSERT [dbo].[Thread] ([tid], [tcontent]) VALUES (3, N'Thread 3')
SET IDENTITY_INSERT [dbo].[Thread] OFF
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Account] FOREIGN KEY([userid])
REFERENCES [dbo].[Account] ([userid])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Account]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Thread] FOREIGN KEY([tid])
REFERENCES [dbo].[Thread] ([tid])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Thread]
GO
