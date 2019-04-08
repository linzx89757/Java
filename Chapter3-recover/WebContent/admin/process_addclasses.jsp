<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*,dao.imp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加班级</title>
</head>
<body>
<!--声明javaBean-->
<jsp:useBean id = "classesService" class = "service.imp.ClassesService" scope = "session"></jsp:useBean>
<%
	request.setCharacterEncoding("gbk");
	//获取班级编号
	String classes_id = request.getParameter("classes_id");
	//获取班级名称
	String classes_name = request.getParameter("classes_name");
	//获取班级所属专业
	String classes_speciality = request.getParameter("classes_speciality");
	//获取班级班导师编号
	String classes_teacher = request.getParameter("classes_teacher");
	//获取班级年级
	String grade = request.getParameter("grade");
	//初始化一个班级类对象
	Classes classes = new Classes();
	classes.setClasses_id(classes_id);
	classes.setClasses_name(classes_name);
	classes.setClasses_speciality(classes_speciality);
	classes.setClasses_teacher(Integer.parseInt(classes_teacher));
	classes.setGrade(Integer.parseInt(grade));
	//调用业务逻辑方法，添加信息到数据库
	classesService.addClasses(classes);
%>
	<!--班级添加成功，回到系统主界面-->
	<jsp:forward page = "main.jsp"></jsp:forward>
</body>
</html>