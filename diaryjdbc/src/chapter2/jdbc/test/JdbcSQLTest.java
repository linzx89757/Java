package chapter2.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;

public class JdbcSQLTest {
	//��jdbcִ��SQL INSERT���
	public static void testInsert() {
		//ָ��JDBC��������
		String driverName = "com.mysql.jdbc.Driver";
		//ָ������MYSQL��jdbc url
		String connectionString = "jdbc:mysql://localhost:3306/diary";
		String user ="root";
		String password = "123456";
		
		try {
			//����JDBC������
			Class.forName(driverName);
			//�õ�һ��Connection
			Connection connection = DriverManager.getConnection(connectionString,user,password);
			//1.�õ�һ������ִ��SQL����Statement
			Statement statement = connection.createStatement();
			//2.ִ��INSERT���
			String insertSQL = "insert into diary(title,content,authorName,time) values('һƪ�ռ�','��������','����',NOW()),('��һƪ�ռ�','��һƪ�ռǵ�����','javaweb������','2011-11-11 09:00:00')";
			int count = statement.executeUpdate(insertSQL);
			//3.����������
			System.out.println("�ɹ�������" + count + "����¼");
			//4.�ر�Statement
			statement.close();
			//�ر�Connection
			connection.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//��JDBCִ��SQL SELECT���
	public static void testSelect() {
		//ָ��JDBC��������
		String driverName = "com.mysql.jdbc.Driver";
		//ָ������MySQL��JDBC URL
		String connectionString = "jdbc:mysql://localhost:3306/diary";
		String user ="root";
		String password = "123456";
		
		try {
			//����JDBC������
			Class.forName(driverName);
			//�õ�һ��Connection
			Connection connection =DriverManager.getConnection(connectionString,user,password);
			//�õ�һ������ִ��SQL����Statement
			Statement statement = connection.createStatement();
			//ִ��SELECT���
			String selectSQL = "select * from diary";
			ResultSet resultSet = statement.executeQuery(selectSQL);
			
			while(resultSet.next()) {
				//�õ��ռǵ�id
				int id = resultSet.getInt("id");
				//�õ��ռǵ���������
				String authorName = resultSet.getString("authorName");
				//�õ��ռǵı��⡢����
				String title =resultSet.getString("title");
				String content = resultSet.getString("content");
				//�õ������ռǵ�ʱ��
				Date time =resultSet.getTime("time");
				//��Dtae����ת��ΪGregorianCalendar����
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(time);
				//�õ������ռǵ�������ʱ��
				int year = gc.get(GregorianCalendar.YEAR);
				int month = gc.get(GregorianCalendar.MONTH);
				int day = gc.get(GregorianCalendar.DATE);
				int hour = gc.get(GregorianCalendar.HOUR_OF_DAY);
				int minute = gc.get(GregorianCalendar.MINUTE);
			
				System.out.println("��" + id + "ƪ���ռǵ����ߣ�" + authorName);
				System.out.println("��" + id + "ƪ���ռǵı��⣺" + title);
				System.out.println("��" + id + "ƪ���ռǵ����ݣ�" + content);
				System.out.println("��" + id + "ƪ���ռǵ�ʱ�䣺" + year + "-" + month + "-" + day + " " + hour + ":" + minute);
			}
				//�ر�Statement��Connection
				statement.close();
				connection.close();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
	}

	//��JDBCִ��SQL UPDATE���
	public static void testUpdate() {
		//ָ��JDBC��������
		String driveName = "com.mysql.jdbc.Driver";
		//ָ������MySQL��JDBC URL
		String url ="jdbc:mysql://localhost:3306/diary";
		String user = "root";
		String pwd ="123456";
		
		try {
			//����JDBC������
			Class.forName(driveName);
			//�õ�һ��Connection
			Connection  conn = DriverManager.getConnection(url,user,pwd);
			//�õ�һ������ִ��SQL���ĵ�Statement
			Statement stmt =conn.createStatement();
			//ִ��UPDATE���
			String insertSQL = "update diary set title = '��һƪ�ռǵ���Ŀ-���޸�', content = '��һƪ�ռǵ�����-���޸�',time = NOW() WHERE title = '��һƪ�ռ�'";
			int count =stmt.executeUpdate(insertSQL);
			
			//����������
			System.out.println("�ɹ��޸���" + count + "����¼");
			//�ر�Statement,Conection
			stmt.close();
			conn.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//��JDBCִ��SQL DELETE���
	public static void testDelete() {
		String diverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/diary";
		String user = "root";
		String pwd = "123456";
		
		
		try {
			Class.forName(diverName);
			Connection conn =DriverManager.getConnection(url, user, pwd);
			
			Statement stmt = conn.createStatement();
			String insertSQL ="delete from diary where id = 1";
			int count =stmt.executeUpdate(insertSQL);
			
			System.out.println("�ɹ�ɾ����" + count + "����¼");
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		//testInsert();
		//testSelect();
		//testUpdate();
		testDelete();
	}
}


