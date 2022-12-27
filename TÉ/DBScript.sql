USE [PRJ321_SP2019]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/1/2019 8:31:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[username] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
	[displayName] [varchar](150) NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Article]    Script Date: 3/1/2019 8:31:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Article](
	[id] [int] NOT NULL,
	[title] [varchar](150) NOT NULL,
	[created_date] [date] NOT NULL,
	[created_by] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Article] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Paper]    Script Date: 3/1/2019 8:31:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Paper](
	[id] [int] NOT NULL,
	[title] [varchar](150) NOT NULL,
	[created_date] [date] NOT NULL,
	[created_by] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Paper] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Account] ([username], [password], [displayName]) VALUES (N'mra', N'mra', N'Mr A')
GO
INSERT [dbo].[Account] ([username], [password], [displayName]) VALUES (N'mrb', N'mrb', N'Mr B')
GO
INSERT [dbo].[Account] ([username], [password], [displayName]) VALUES (N'mrc', N'123', N'Mr C')
GO
INSERT [dbo].[Article] ([id], [title], [created_date], [created_by]) VALUES (1, N'Programming with C', CAST(0x5A3F0B00 AS Date), N'mra')
GO
INSERT [dbo].[Article] ([id], [title], [created_date], [created_by]) VALUES (2, N'Advance Java', CAST(0x5B3F0B00 AS Date), N'mra')
GO
INSERT [dbo].[Article] ([id], [title], [created_date], [created_by]) VALUES (3, N'Data Structure and Algorithm', CAST(0x5C3F0B00 AS Date), N'mrb')
GO
INSERT [dbo].[Paper] ([id], [title], [created_date], [created_by]) VALUES (1, N'A Style-Based Generator Architecture for Generative Adversarial Networks
', CAST(0x5A3F0B00 AS Date), N'mra')
GO
INSERT [dbo].[Paper] ([id], [title], [created_date], [created_by]) VALUES (2, N'Language Models are Unsupervised Multitask Learners
', CAST(0x5B3F0B00 AS Date), N'mrc')
GO
ALTER TABLE [dbo].[Article]  WITH CHECK ADD  CONSTRAINT [FK_Article_Account] FOREIGN KEY([created_by])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Article] CHECK CONSTRAINT [FK_Article_Account]
GO
ALTER TABLE [dbo].[Paper]  WITH CHECK ADD  CONSTRAINT [FK_Paper_Account] FOREIGN KEY([created_by])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[Paper] CHECK CONSTRAINT [FK_Paper_Account]
GO
