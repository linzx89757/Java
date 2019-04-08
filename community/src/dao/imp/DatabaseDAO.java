package dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDAO {
	private Connection conn = null;
	/**
	 * ��ȡ���ݿ����Ӷ���
	 * @return ���ݿ����Ӷ���
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		Connection conn = null;
		//�������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		//��ʼ�����ݿ����ӷ���ָ���ַ������뼯
		String connstr = "jdbc:mysql://localhost:3306/community?useUnicode = true&characterEncoding = utf8";
		//��������ʼ�����ݿ��û���������
		String user = "root";
		String password = "123456";
		//�������ݿⲢ��֤����
		conn =DriverManager.getConnection(connstr,user,password);
		System.out.println("Connection created!");
		return conn;
	}
	
	/**
	 * �ر����е����Ӷ���
	 * @throws SQLException
	 */
	public void releaseConnection() throws SQLException{
		this.conn.close();
		this.conn = null;
	}
	
		/**
		 * ִ��һ��SQL��ѯ��䣬�����ز�ѯ�Ľ����
		 * @param SQL��ѯ���
		 * @return ���ݿ��ѯ�����
		 * @throws SQLException
		 * @throws ClassNotFoundException
		 */
		public ResultSet getResultSet(String querySQL) throws SQLException,ClassNotFoundException{
			if(conn == null) {
				this.conn = getConnection();
			}
			Statement stm = conn.createStatement();
			//ִ��SQL��ѯ��䲢���ز�ѯ�����
			ResultSet thisRST = stm.executeQuery(querySQL);
			return thisRST;
		}
	
		/**
		 * ֱ��ִ��һ�������ݿ��޸ģ�������ɾ��ģ���SQL���
		 * @param SQL���
		 * @throws SQLException
		 * @throw ClassNotFoundException
		 */
		public void executeSQL(String SQL) throws SQLException,ClassNotFoundException{
			if(conn == null) {
				this.conn = getConnection();
			}
			Statement stm = conn.createStatement();
			//ִ�и�����SQL���
			stm.executeUpdate(SQL);
			//�ر����Ӷ���
			this.conn.close();
			this.conn = null;
		}
		
		/**
		 * ����������
		 * @param args
		 */
		public static void main(String[] args) {
			//�������ݿ����������
			DatabaseDAO myDb = new DatabaseDAO();
			 try {
				 //��ȡ���ݿ����Ӷ���
				 myDb.conn = myDb.getConnection();
				 //�ͷ����Ӷ���
				 myDb.releaseConnection();
				 //�����׳����쳣
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }catch(ClassNotFoundException e) {
				 e.printStackTrace();
			 }
		}
}