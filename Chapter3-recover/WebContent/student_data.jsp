<%@ page language="java" contentType="text/html; charset=gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,domain.*,service.imp.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生--更新个人资料</title>
</head>
<body>
		<div id="menu">
				<a href =	 "student_data.jsp">个人资料</a>
				<a href = "gpa.jsp"	>查看绩点情况</a>	
				<a href ="">综合测评</a>
				<a href = "student_main.jsp">公示信息浏览</a>				
				<a href = "login.jsp">退出</a>			
</div>
		<div>
		
		<p>学号：<%=((Student)session.getAttribute("student")).getStudent_id() %></p>
		<form action="process_student_data.jsp" method="post">
		<table>
			<tr>
				<td>
					<label>真实姓名</label>
				</td>
				<td>
					<input type = "text" name = "student_name" placeholder = "<%=((Student)session.getAttribute("student")).getStudent_name() %>"/>
				</td>		
			</tr>
			<tr>
				<td>
					<label>性别</label>
				</td>
				<td>
					<input type = "text" name = "student_tel" placeholder = "<%=((Student)session.getAttribute("student")).getStudent_sex() %>" />
				</td>
			</tr>
			<tr>
				<td>
					<label>电话号码</label>
				</td>
				<td>
					<input type = "text" name = "student_tel" placeholder = "<%=((Student)session.getAttribute("student")).getStudent_tel() %>" />
				</td>
			</tr>
			<tr>
				<td>
					<label>年级</label>
				</td>
				<td>
					<input type = "text" name = "grade" placeholder = "<%=((Student)session.getAttribute("student")).getGrade()%>" />
				</td>
			</tr>
			<tr>
				<td>
					<label>班级</label>
				</td>
				<td>
					<input type = "text" name = "student_class" placeholder = "<%=((Student)session.getAttribute("student")).getStudent_class()%>" />
				</td>
			</tr>
			<tr>
				<td>
					<label>密码</label>
				</td>
				<td>
					<input type = "password" name = "student_password" placeholder = "<%=((Student)session.getAttribute("student")).getStudent_password() %>"/>
				</td>		
			</tr>
			<tr>
				<td>
					<input type = "submit" value = "保存">
				</td>
			</tr>	
		
		</div>
		
</body>
</html>