
USE [PRJ321_SP19_B5]
GO
/****** Object:  Table [dbo].[MessageTBL]    Script Date: 4/29/2019 3:05:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[MessageTBL](
	[messageid] [int] IDENTITY(1,1) NOT NULL,
	[messagetitle] [varchar](150) NOT NULL,
	[messagetime] [datetime] NOT NULL,
	[from] [varchar](150) NOT NULL,
	[to] [varchar](150) NOT NULL,
	[messagecontent] [varchar](4000) NOT NULL,
	[isread] [bit] NOT NULL,
 CONSTRAINT [PK_MessageTBL] PRIMARY KEY CLUSTERED 
(
	[messageid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Requests]    Script Date: 4/29/2019 3:05:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Requests](
	[requestid] [int] NOT NULL,
	[userid] [varchar](150) NOT NULL,
	[from] [date] NOT NULL,
	[to] [date] NOT NULL,
	[reason] [varchar](4000) NOT NULL,
 CONSTRAINT [PK_Requests] PRIMARY KEY CLUSTERED 
(
	[requestid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[UserTBL]    Script Date: 4/29/2019 3:05:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[UserTBL](
	[userid] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
 CONSTRAINT [PK_UserTBL] PRIMARY KEY CLUSTERED 
(
	[userid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[MessageTBL] ON 

INSERT [dbo].[MessageTBL] ([messageid], [messagetitle], [messagetime], [from], [to], [messagecontent], [isread]) VALUES (2, N'B, I need help', CAST(0x0000AA3700000000 AS DateTime), N'mrb', N'mra', N'I loose all of my money, can i borrow 500usd', 0)
INSERT [dbo].[MessageTBL] ([messageid], [messagetitle], [messagetime], [from], [to], [messagecontent], [isread]) VALUES (3, N'I reject your request', CAST(0x0000AA3700000000 AS DateTime), N'mrc', N'mra', N'I have seen your message but i cannot, bro', 1)
INSERT [dbo].[MessageTBL] ([messageid], [messagetitle], [messagetime], [from], [to], [messagecontent], [isread]) VALUES (4, N'Spam', CAST(0x0000AA3600000000 AS DateTime), N'mrd', N'mra', N'I have seen your message but i cannot, bro', 0)
INSERT [dbo].[MessageTBL] ([messageid], [messagetitle], [messagetime], [from], [to], [messagecontent], [isread]) VALUES (5, N'Spam from D to B', CAST(0x0000AA3600000000 AS DateTime), N'mrd', N'mrb', N'I have seen your message but i cannot, bro', 0)
INSERT [dbo].[MessageTBL] ([messageid], [messagetitle], [messagetime], [from], [to], [messagecontent], [isread]) VALUES (6, N'Spam from D to C', CAST(0x0000AA3600000000 AS DateTime), N'mrd', N'mrc', N'I have seen your message but i cannot, bro', 0)
SET IDENTITY_INSERT [dbo].[MessageTBL] OFF
INSERT [dbo].[Requests] ([requestid], [userid], [from], [to], [reason]) VALUES (1, N'mrb', CAST(0x993F0B00 AS Date), CAST(0x9C3F0B00 AS Date), N'Nghi Le di choi')
INSERT [dbo].[Requests] ([requestid], [userid], [from], [to], [reason]) VALUES (2, N'mrb', CAST(0xDD3F0B00 AS Date), CAST(0xDD3F0B00 AS Date), N'Cuoi nguoi nha')
INSERT [dbo].[UserTBL] ([userid], [password]) VALUES (N'mra', N'123')
INSERT [dbo].[UserTBL] ([userid], [password]) VALUES (N'mrb', N'456')
INSERT [dbo].[UserTBL] ([userid], [password]) VALUES (N'mrc', N'789')
INSERT [dbo].[UserTBL] ([userid], [password]) VALUES (N'mrd', N'123')
ALTER TABLE [dbo].[MessageTBL]  WITH CHECK ADD  CONSTRAINT [FK_MessageTBL_UserTBL] FOREIGN KEY([from])
REFERENCES [dbo].[UserTBL] ([userid])
GO
ALTER TABLE [dbo].[MessageTBL] CHECK CONSTRAINT [FK_MessageTBL_UserTBL]
GO
ALTER TABLE [dbo].[MessageTBL]  WITH CHECK ADD  CONSTRAINT [FK_MessageTBL_UserTBL1] FOREIGN KEY([to])
REFERENCES [dbo].[UserTBL] ([userid])
GO
ALTER TABLE [dbo].[MessageTBL] CHECK CONSTRAINT [FK_MessageTBL_UserTBL1]
GO
ALTER TABLE [dbo].[Requests]  WITH CHECK ADD  CONSTRAINT [FK_Requests_UserTBL] FOREIGN KEY([userid])
REFERENCES [dbo].[UserTBL] ([userid])
GO
ALTER TABLE [dbo].[Requests] CHECK CONSTRAINT [FK_Requests_UserTBL]
GO
