package dao.imp;

import domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IDatabaseDAO;
import dao.IUserDAO;

public class UserDAO implements IUserDAO{
	/**
	 * Ĭ�Ϲ��캯��
	 */	
	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * �����ݿ��������û�
	 * @param user
	 */
	public void addUser(User user) {
		//��ʼ�����ݿ������
		IDatabaseDAO myDB = new DatabaseDAO();
		//����SQL���
		String sql = "insert into users(Username,password,Realname,Gender,Age,PersonalSignature) values( '"+ user.getUserName() +"','"+ user.getPassword() +"','"+ user.getRealName() +"','"+ user.getGender()+"','"+ user.getAge()+"','"+ user.getPersonalSignature()+"')";
		try {
			//ִ��SQL���
			myDB.executeSQL(sql);
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}			
	}
	
	/**
	 * �����ݿ��в�ѯidΪ����ֵid���û�
	 * @param id
	 * @return ���ز�ѯ���õ��û�	 
	 */
	public User getUserByID(String id) {
		//��ʼ�����ݿ������
		IDatabaseDAO myDB = new DatabaseDAO();
		//��ʼ��һ��User���󣬸ö���������Ϊ����ֵ
		User user = new User();
		//��ʼ��SQL���
		String sql = "select * from users where ID ='"+ id +"'";
		try {
			//ִ��SQL��䣬����ȡ��ѯ�Ľ����
			ResultSet mySet = myDB.getResultSet(sql);
			//ѭ�������������user����ֵ
			while(mySet.next()) {
				//Ϊuser����ֵ
				user.setId(mySet.getString("Id"));
				user.setUserName(mySet.getString("UserName"));
				user.setPassword(mySet.getString("Password"));
				user.setRealName(mySet.getString("RealName"));
				user.setGender(mySet.getString("Gender"));
				user.setAge(mySet.getString("Age"));
				user.setPersonalSignature(mySet.getString("PersonalSignature"));
			}
			
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}finally {
			try {
				//�����ʹ����ϣ��ر����ݼ�������������ݿ����Ӷ���
				myDB.releaseConnection();
			}catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
		//���ػ�ȡ���û�����
		return user;
	}
	
	/**
	 * ����userName��ѯ���ݿ��е��û���Ϣ���ڱ���Ŀ�У�userName����Ψһ�ԣ�
	 * ��ˣ��ú����ķ���ֵ���Ϳ�����User.
	 * ����List<User>��ԭ�����Է���һ���÷����Ĵ���ͷ���getUserByID()������ͬ
	 * 
	 */
	public List<User> getUserByUserName(String userName){
		IDatabaseDAO myDB = new DatabaseDAO();
		User user = new User();
		List<User> list = new ArrayList<User>();
		String sql = "select * from users where Username = '"+ userName +"'";
		try {
			ResultSet mySet = myDB.getResultSet(sql);
			while(mySet.next()) {
				user.setId(mySet.getString("Id"));
				user.setUserName(mySet.getString("UserName"));
				user.setPassword(mySet.getString("Password"));
				user.setRealName(mySet.getString("RealName"));
				user.setGender(mySet.getString("Gender"));
				user.setAge(mySet.getString("Age"));
				user.setPersonalSignature(mySet.getString("PersonalSignature"));
				list.add(user);
			}
			
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}finally {
			try {
				//�����ʹ����ϣ��ر����ݼ�������������ݿ����Ӷ���
				myDB.releaseConnection();
			}catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
		System.out.println(list.size());
		return list;
	}
	//����user����Ϣ
	public void updateUser(User user) {
		//��ʼ�����ݿ������
		IDatabaseDAO myDB = new DatabaseDAO();
		//����SQL���
		String sql = "update users set RealName = '"+user.getRealName()+"',Gender = '"+user.getGender()+"',Age = '"+ user.getAge()+"' ,PersonalSignature = '"+ user.getPersonalSignature()+"', password = '"+ user.getPassword() +"'   where Username = '"+user.getUserName()+"'  ";
		System.out.println(sql);
		try {
			//ִ��SQL���
			myDB.executeSQL(sql);
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}			
	}
}