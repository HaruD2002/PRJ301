USE [PRJ301_Test_Morning]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 11/30/2022 10:26:54 AM ******/
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
SET IDENTITY_INSERT [dbo].[Student] ON 

INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (1, N'Pham Thi Ngoc Huyen', CAST(N'2002-03-28' AS Date), 0)
INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (2, N'Nguyen Nhu Quynh', CAST(N'2000-11-20' AS Date), 0)
INSERT [dbo].[Student] ([id], [name], [dob], [gender]) VALUES (3, N'Ngo Tung Son', CAST(N'1997-11-13' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Student] OFF
GO
