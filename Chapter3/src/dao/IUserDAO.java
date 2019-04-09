package dao;

import java.util.List;

import domain.User;

/**
 * User���Ӧ��DAO�ӿڣ��ṩһЩ���û���ص����ݿ�CRUD�����Ĺ����ķ�������
 * @author Administrator
 *
 */
public interface IUserDAO {
	//���һ���û������ݿ�
	public void addUser(User user);
	//���¹���Ա�û���Ϣ
	public void updateUser(User user);
	//ɾ���û�
	public void deleteUser(String username);
	//�����û���Ż�ȡ�û���Ϣ����User�������ʽ����
	public User getUserByID(String id);
	//�����û�����ȡ�û���Ϣ����User�������ʽ����
	public List<User> getUserByUserName(String userName);
	
	
	
	
}
