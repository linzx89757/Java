<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*,dao.imp.*"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>公告详情</title>
</head>
<body>
<jsp:useBean id="infoService" class="service.imp.InfoService" scope="session"></jsp:useBean>
<%
	request.setCharacterEncoding("gbk");
	int id = Integer.parseInt(request.getParameter("Id"));
	out.println("id:"+id);	
%>
<%
    //调用业务逻辑层方法，获取所有信息列表
	List<Information> list = infoService.getAllInfo();
%>
	<%
		for(Information info:list){
			if(info.getId() == id){
	%>	
		<p>公告详情：<%=info.getContent()%></p>
	<%
			}
		}
	%>				

</body>
</html>