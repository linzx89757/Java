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
    
    <title>������Ϣ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <jsp:useBean id="infoService" class="service.imp.InfoService" scope="session"></jsp:useBean>
<%
    //����ҵ���߼��㷽������ȡ������Ϣ�б�
	List<Information> list = infoService.getAllInfo();
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
   <form action="Process_addinformation.jsp" method="post">
	<table>
		<tr>
			<td>
				<label>����</label>
				<input type="text" name="title"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>����</label>
				<textarea rows="3" cols="18" name="content"></textarea>
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