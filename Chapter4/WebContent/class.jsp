<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*,dao.imp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>�༶����</title>
</head>
<body>
<div id="menu">
				<a href =	 "data.jsp">��������</a>		
				<a href = "main.jsp">��ʾ��Ϣ���</a>
				<a href = "class.jsp">�༶�б�</a>
				<a href = "register.jsp">���ӹ���Ա</a>			
				<a href = "addinformation.jsp">������Ϣ</a>
				<a href = "addclasses.jsp">���Ӱ༶</a>
				<a href = "class_student_detail.jsp">����ѧ����Ϣ</a>
				<a href = "login.jsp">�˳�</a>
				<h3>����Ա��<%=((User)session.getAttribute("user")).getUserName() %></h3>				
		</div>	
<jsp:useBean id="classesService" class="service.imp.ClassesService" scope="session"></jsp:useBean>

<%
    //����ҵ���߼��㷽������ȡ������Ϣ�б�
	List<Classes> list = classesService.getAllClasses();
%>
	<%
		for(Classes classes:list){
			
	%>	
		<p><a href="classes_detail.jsp?classes_id=<%=classes.getClasses_id()%>"><%=classes.getClasses_id()%></a> �༶���ƣ�<%=classes.getClasses_name()%></p>
	<%
			
		}
	%>			
</body>
</html>