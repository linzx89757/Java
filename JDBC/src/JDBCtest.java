import java.sql.*;

public class JDBCtest {
	static final String user = "root";
	static final String password = "123456";	
	static final String dburl = "jdbc:mysql://localhost:3306/test";
	
	public static void main(String[] args) {
		try {
			//2.ע��JDBC��������
			Class.forName("com.mysql.jdbc.Driver");
			
			//3.��������
			Connection con = java.sql.DriverManager.getConnection(dburl,user,password);
				
			//4.ִ��һ����ѯ
			System.out.println("Creating statement...");
			Statement stmt = con.createStatement();
			String sql ="select id from employees";
			ResultSet rs =stmt.executeQuery(sql);
			
			//5.�ӽ��������ȡ����
			while(rs.next()) {
				int id = rs.getInt("id");
				System.out.println("ID: " + id);				
			}
			
			//6.��������Դ
			rs.close();
			stmt.close();
			con.close();		
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Goodbye!");
	}
	
}
