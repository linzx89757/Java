package service;

import java.util.List;
import domain.User;

/**
 * User��Ӧ��ҵ���߼��ӿڣ��ṩһЩ����Ϣ��ص�ҵ���߼������Ĺ����ķ�������
 */
public interface IUserService {
	
	//���ע���û���Ϣ�����ݿ�
	public void addUser(User user);

	//�����û���Ż�ȡ�û���Ϣ
	public User getUserByID(String id);

	//��֤�û���¼���������Ƿ�Ϸ�
	public User validateUser(String userName, String password);
	
	//��֤�û����Ƿ��Ѿ�����
	public boolean isUserExist(String userName);
	
	//���¸�������
		public void updateUser(User user);
		
	//ɾ������Ա�û�
		public void delete(String username);
}

