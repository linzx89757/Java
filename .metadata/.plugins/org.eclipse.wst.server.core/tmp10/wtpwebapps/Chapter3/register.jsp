<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@page import="java.util.*,domain.*,service.imp.*"%><html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>�����û�</title>
</head>
<body>
<jsp:useBean id="infoService" class="service.imp.InfoService" scope="session"></jsp:useBean>

<div>	
				
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
			<div class="post">
				<div class="header">
					<h3>������Ϣ</h3>					
				</div>
				<div class="content">
					<form action="process_register.jsp" method="post">
                       <table id ="userInfo_table">
							<tr>
								<td>
									<label>�û���</label>
							 	</td>
								<td>
									<input type="text" name="userName"/>
								</td>
							</tr>
							<tr>
								<td>
									<label>��    ��</label>
							 	</td>
								<td>
									<select name="gender">
										<option value="��" selected="selected">��</option>
                                        <option value="Ů">Ů</option>
									</select>
								</td>
							</tr>
                            <tr>
								<td>
									<label>��ʵ����</label>
							 	</td>
								<td>
									<input type="text" name="realName"/>
								</td>
							</tr>
                            <tr>
								<td>
									<label>����</label>
							 	</td>
								<td>
									<input type="password" name="password"/>
								</td>
							</tr>
                            <tr>
								<td>
									<label>����</label>
							 	</td>
								<td>
									<input type="text" name="age"/>
								</td>
							</tr>
                            <tr>
								<td>
									<label>����ǩ��</label>
							 	</td>
								<td>
									<textarea rows="3" cols="18" name="personalSignature"></textarea>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<input type ="submit" value="ע��"/>
								</td>
							</tr>
						</table>
					</form>
				</div>											
</div>
</body>
</html>
