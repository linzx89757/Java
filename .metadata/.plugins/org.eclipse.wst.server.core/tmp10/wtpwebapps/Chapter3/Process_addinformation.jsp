<%@ page language="java" contentType="text/html; charset=gbk"%>

<%@ page import="domain.User" %>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="domain.Information"%>

<%@page import="service.imp.InfoService"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>���Ӱ༶ҳ��</title>
</head>
<body>
<!-- ����javaBean -->
<jsp:useBean id="infoService" scope="session" class="service.imp.InfoService"></jsp:useBean>
<%
  request.setCharacterEncoding("gbk");
	//��ȡ����
	String title = request.getParameter("title");
    //��ȡ��Ϣ����
    String content = request.getParameter("content");
   
    //��ȡ�Ự�е�user���󣬲�ȡ���û���
    String userName=((User)session.getAttribute("user")).getUserName();
    //��ʼ��һ����Ϣ�����
    Information information = new Information();
    information.setTitle(title);
    information.setContent(content);
   
    
    information.setPublishingtime(new Date().toString());
   
    //�����û��ֶ�
    information.setPublishiuser(userName);
    //����ҵ���߼��㷽����������Ϣ�����ݿ�
    infoService.addInfo(information);
    
%>
    <!--��Ϣ�����ɹ����ص�ϵͳ������  -->
	<jsp:forward page="main.jsp"></jsp:forward>
</body>
</html>