<%@ page language="java" contentType="text/html; charset=gbk"
 %>
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
     <base href="<%=basePath%>">
    
    <title>学生综合测评管理系统-管理员登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
  <div>
 		<form action="process_admin_login.jsp" method="post">
					<img src = "" ></br>
					<input type = "text"  required = "required" name="username" placeholder="请输入学号或工号" /></br>
					<input type = "password" required = "required" name="password" placeholder="请输入密码"/></br>
					<input type = "text" required = "required" name = "yzm" placeholder = "请输入验证码" /></br>	
					<a href="">忘记密码</a></br>
				    <input type="submit" value="登录"/>			
		</form>
	</div>

  </body>
</html>
