package chapter2.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		//1.ָ��JDBC��������
		String driverName = "com.mysql.jdbc.Driver";
		//2.ָ������MySQL��JDBC URL
		String connectionString = "jdbc:mysql://localhost:3306/diary";
		String user ="root";
		String password = "123456";
		
		try {
			//3.����JDBC������
			Class.forName(driverName);
			//4.�õ�һ��Connection����
			Connection conn =DriverManager.getConnection(connectionString,user,password);
			//5.�ر�Connection����
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
