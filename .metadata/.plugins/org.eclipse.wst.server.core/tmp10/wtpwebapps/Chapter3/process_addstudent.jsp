<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@ page import="service.imp.StudentService" %>
<%@ page import="domain.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>���ѧ��</title>
</head>
<body>
<jsp:useBean id="studentService" class="service.imp.StudentService" scope="session"></jsp:useBean>
<%
  request.setCharacterEncoding("gbk");
    //��ȡ�û�ѧ�ţ�"student_id"��addstudent.jsp��name����Ϊ"student_id"���ı����Ӧ
	String student_id=request.getParameter("student_id");

    //��ȡ���룬"password"��addstudent.jsp��name����Ϊ"student_password"���ı����Ӧ
	String password = request.getParameter("student_password");
    
    //��ȡ��ʵ������"student_name"��addstudent.jsp��name����Ϊ"student_name"���ı����Ӧ
	String student_name = request.getParameter("student_name");
    
    //��ȡ�Ա�"gender"��addstudent.jsp��name����Ϊ"gender"���ı����Ӧ
	String gender = request.getParameter("gender");
    
    //��ȡ�꼶��"grade"��addstudent.jsp��name����Ϊ"grade"���ı����Ӧ
	String grade = request.getParameter("grade");
    
    //��ȡ�绰���룬"student_tel"��addstudent.jsp��name����Ϊ"student_tel"���ı����Ӧ
	String student_tel = request.getParameter("student_tel");
	//��ȡ�༶��"student_class"��addstudent.jsp��name����Ϊ��student_class�����ı����Ӧ
	String student_class = request.getParameter("student_class");
	
	Student student = new Student();
	
	//�����û������
	student.setStudent_id(student_id);
	student.setStudent_name(student_name);
	student.setStudent_password(password);
	student.setStudent_sex(gender);
	student.setStudent_tel(student_tel);
	student.setGrade(Integer.parseInt(grade));
	try
	{
		//����ҵ���߼���ķ��������ӹ��ܣ�studentService�������useBeanԪ���е�id���Զ�Ӧ
		studentService.addStudent(student);
%>
        <!-- ע��ɹ�����ת����¼���� -->
		<jsp:forward page="admin_main.jsp"></jsp:forward>
<%
	}
	//�����쳣
	catch(Exception ex)
	{
		ex.printStackTrace();
			
%>
       <!-- ע��ʧ�ܣ��ص�ԭ���� -->
		<jsp:forward page="addstudent.jsp"></jsp:forward>
<%
	}
%>	
</body>
</html>
