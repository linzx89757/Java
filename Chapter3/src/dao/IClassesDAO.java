package dao;

import java.util.List;

import domain.Classes;

/**
 * Classes ���ӦDAO�ӿڣ��ṩһЩ���û���ص����ݿ�CRUD�����Ĺ����ķ�������
 * @author Administrator
 *
 */
public interface IClassesDAO {
	//���һ���༶�����ݿ�
	public void addClasses(Classes classes);
	
	//��ȡ���а༶��Ϣ
	public List<Classes> getAllClasses();
	//���°༶��Ϣ
	public void updateClass(Classes classes);
	//���ݰ༶���ɾ���༶
	public void deleteClass(String classes_id);
	
	
}
