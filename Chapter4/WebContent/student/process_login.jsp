<%@ page language="java" contentType="text/html; charset=gbk"%>

<%@page import="service.imp.UserService.*,domain.User.*"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>��½����</title>
</head>
<body>
<jsp:useBean id="studentService" class="service.imp.StudentService" scope="session"></jsp:useBean>
<%
	request.setCharacterEncoding("gbk");
	String student_id=request.getParameter("student_id");
	String student_password=request.getParameter("student_password");
	if(studentService.validateStudent(student_id,student_password) != null)
	{
        //�����û����󵽻Ự
		session.setAttribute("student",studentService.validateStudent(student_id,student_password));
%>
		<jsp:forward page="student_main.jsp"></jsp:forward>
<%
	}
	else
	{
%>
		<jsp:forward page="login.jsp"></jsp:forward>
<%
	}
%>
</body>
</html>