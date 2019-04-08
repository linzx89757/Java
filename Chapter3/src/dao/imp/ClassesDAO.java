package dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IClassesDAO;
import domain.Classes;

//Classes���Ӧ��DAO
public class ClassesDAO implements IClassesDAO{

	public ClassesDAO() {
		// TODO Auto-generated constructor stub
	}
	//�����ݿ������Ӱ༶
	public void addClasses(Classes classes) {
		//��ʼ�����ݿ������
		DatabaseDAO myDB = new DatabaseDAO();
		//����SQL���
		String sql = "insert into classes(classes_id,classes_name,classes_speciality,classes_teacher,grade) values('"+classes.getClasses_id()+"','"+classes.getClasses_name()+"','"+classes.getClasses_speciality()+"','"+classes.getClasses_teacher()+"','"+classes.getGrade()+"')";
	    //��ӡsql���
		System.out.println("sql��䣺"+sql);
		
		try {
			myDB.executeSQL(sql);
		}catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}		
	}
	
	/**
	 * �����ݿ��л�ȡ������Ϣ
	 */
	public List<Classes> getAllClasses(){
		//��ʼ��sql��ѯ���
		String sql = "select * from classes";
		//������ط����������ز�ѯ���
		return getClassesBySqlString(sql);
	}
	
	/**
	 * �÷���ͨ��ִ��һ����ѯ��SQL�������ȡ��ѯ��������Ѳ�ѯ�����װ����Ϣ�б�����
	 * 
	 */
	public List<Classes> getClassesBySqlString(String sql){
		//��ʼ�����ݿ������
		DatabaseDAO myDB = new DatabaseDAO();
		//������Ϣ�б���Ԥ�����ض���
		List<Classes> list = new ArrayList<Classes>();
		
		try {
			//ִ��sql��ѯ��䣬����ȡ��ѯ�����
			ResultSet mySet = myDB.getResultSet(sql);
			while(mySet.next()) {
				//����༶�����������װ��ѯ����
				Classes classes = new Classes();
				//���ð༶������classes_id�ֶ�ֵ
				classes.setClasses_id(mySet.getString("classes_id"));
				//���ð༶������classes_name�ֶ�ֵ
				classes.setClasses_name(mySet.getString("classes_name"));
				//���ð༶������classes_speciality�ֶ�ֵ
				classes.setClasses_speciality(mySet.getString("classes_speciality"));
				//���ð༶������classes_teacher�ֶ�ֵ
				classes.setClasses_teacher(mySet.getInt("classes_teacher"));
				//���ð���۶����grade�ֶ�ֵ
				classes.setGrade(mySet.getInt("grade"));
				//�Ѱ༶�������뷵�����ݼ���
				list.add(classes);
			}			
		}catch(ClassNotFoundException cnfEx){
			cnfEx.printStackTrace();
		}catch(SQLException sqlEx){
			sqlEx.printStackTrace();
		}finally{			
			try{
				//�ͷ����ݿ����������ݿ����Ӷ���
				myDB.releaseConnection();
			}catch(SQLException sqlEx){
				sqlEx.printStackTrace();
			}	
		}
		//���ؽ��
		return list;	
	}
}