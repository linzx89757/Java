<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>���Ӱ༶��Ϣ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <jsp:useBean id = "classesService" class = "service.imp.ClassesService" scope = "session"></jsp:useBean>
<%
	//����ҵ���߼���������ȡ���а༶��Ϣ�б�
	List<Classes> list = classesService.getAllClasses();
%>
  
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
   <form action="process_addclasses.jsp" method="post">
	<table>
		<tr>
			<td>
				<label>�༶���</label>
				<input type="text" name="classes_id"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>�༶����</label>
				<input type = "text" name = "classes_name" />
			</td>
		</tr>
		<tr>
			<td>
				<label>����רҵ</label>
				<input type = "text" name = "classes_speciality" />
			</td>
		</tr>
		<tr>
			<td>
				<label>�ർʦ���</label>
				<input type = "text" name = "classes_teacher" />
			</td>
		</tr>
		<tr>
			<td>
				<label>�꼶</label>
				<select name = "grade">
					<option value = "2015">2015</option>
					<option value = "2016">2016</option>
					<option value = "2017">2017</option>
					<option value = "2018">2018</option>										
				</select>
			</td>
		</tr>								
		<tr>
			<td>
				<input type="submit" value="����"/>
			</td>
		</tr>
	</table>
</form>

  </body>
</html>