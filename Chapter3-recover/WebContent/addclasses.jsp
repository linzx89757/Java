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
    
    <title>添加班级信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <jsp:useBean id = "classesService" class = "service.imp.ClassesService" scope = "session"></jsp:useBean>
<%
	//调用业务逻辑方法，获取所有班级信息列表
	List<Classes> list = classesService.getAllClasses();
%>
  
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
   <form action="process_addclasses.jsp" method="post">
	<table>
		<tr>
			<td>
				<label>班级编号</label>
				<input type="text" name="classes_id"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>班级名称</label>
				<input type = "text" name = "classes_name" />
			</td>
		</tr>
		<tr>
			<td>
				<label>所属专业</label>
				<input type = "text" name = "classes_speciality" />
			</td>
		</tr>
		<tr>
			<td>
				<label>班导师编号</label>
				<input type = "text" name = "classes_teacher" />
			</td>
		</tr>
		<tr>
			<td>
				<label>年级</label>
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
				<input type="submit" value="添加"/>
			</td>
		</tr>
	</table>
</form>

  </body>
</html>
