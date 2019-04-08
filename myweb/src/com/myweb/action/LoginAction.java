package com.myweb.action;
import java.sql.*;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String password;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		//JDBC�������ݿ�Ĳ���
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String usr = this.getUserName();
		String pwd = this.getPassword();
		String back =null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //��������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myweb","root","123456");//��������
			String sql = "select * from user_info where userName = '"+usr+"' and password = '"+pwd+"' ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {                   //�ж��Ƿ��ҵ���Ӧ���û���������
				Map<String,Object> session = null;
				ActionContext ac = ActionContext.getContext();
				session = ac.getSession();
				session.put("CURRENT_USER",usr);
				back = "success";		//��¼�ɹ�������success�ַ���
			}else {
				this.setMessage("��¼ʧ�ܣ������û����������Ƿ���ȷ");
				back = "input";    		//��¼ʧ�ܣ�����input�ַ���
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {								//�رն�������ݿ�����
			try {
				if(null != rs) {
					rs.close();
				}
				if(null != pstmt) {
					pstmt.close();
				}
				if(null != conn) {
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return back;
	}
}
