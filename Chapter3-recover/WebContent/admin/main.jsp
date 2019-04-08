<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*,dao.imp.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生综合测评管理系统</title>
</head>
<body>
<jsp:useBean id="infoService" class="service.imp.InfoService" scope="session"></jsp:useBean>

<%
    //调用业务逻辑层方法，获取所有信息列表
	List<Information> list = infoService.getAllInfo();
%>	
	<div>		
		<div id="menu">
				<a href =	 "data.jsp">个人资料</a>		
				<a href = "main.jsp">公示信息浏览</a>
				<a href = "class.jsp">班级列表</a>
				<a href = "register.jsp">添加管理员</a>			
				<a href = "addinformation.jsp">发布信息</a>
				<a href = "addclasses.jsp">添加班级</a>
				<a href = "class_student_detail.jsp">所有学生信息</a>
				<a href = "login.jsp">退出</a>
				<h3>管理员：<%=((User)session.getAttribute("user")).getUserName() %></h3>				
		</div>
		<div id="primarycontent">		
			<!-- primary content start -->
			<div class="post">	
			<h1>公告栏</h>				
                    <%
                    //循环帖子列表，显示日志信息
					for(Information info:list)
					{						
					%>
					<div class="content">
 						<!-- 读者请注意此处的Java表达式运用 -->
						<p><a href="detail.jsp?Id=<%=info.getId()%>"><%=info.getTitle()%></a>&nbsp;&nbsp;<%=info.getPublishingtime()%></p>
					</div>			
					<%						
						}
					%>										
			</div>
			
		</div>

	</div>
</body>
</html>
