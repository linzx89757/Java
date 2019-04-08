package service.imp;

import java.util.List;
import dao.IUserDAO;
import dao.imp.UserDAO;
import domain.User;
import service.IUserService;

/**
 * �û������࣬��������ҵ���߼�
 */
public class UserService implements IUserService {
	/**
	 * ����IUserDAO���͵����ԣ���ʵ��UserService��IUserDAOʵ����֮���Э��
	 */
	private IUserDAO userDAO = new UserDAO();

	/**
	 * Ĭ�Ϲ��캯��
	 */
	public UserService() {
		
	}

	/**
	 * �����ݿ��������û� ����û��������ڣ������ӣ���������
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		// ����û�Ϊ�գ��򷵻أ���������
		if (user.getUserName() == null)
			return;
	
		// ����û���
		String userName = user.getUserName();
		// �����ݿ��в�ѯ�û���ΪuserName���û�
		List<User> users = userDAO.getUserByUserName(userName);
		// ������ص��û���¼��ĿС�ڵ���0��˵�����û���������
		if (users.size() <= 0) {
			// �����ݿ��������û�
			userDAO.addUser(user);
		} else {
			// �׳��쳣
			throw new RuntimeException("���û����Ѵ��ڣ�������û�����");
		}
	}

	/**
	 * ���ݲ���id��ѯ���ݿ����û�
	 * 
	 * @param id
	 * @return ���ز�ѯ�����û�
	 */
	public User getUserByID(String id) {
		// ���idΪ�գ��򷵻�
		if (id == null)
			return null;
		return userDAO.getUserByID(id);
	}

    /**
     * ��֤�û��ĺϷ���
     * 
     * @param �û���������
     * @return �û��Ϸ�����true�����򷵻�false
     */
	public User validateUser(String userName, String password) {

		//�������ݷ��ʷ�����ȡ�û�����Ӧ���û���Ϣ
		List<User> users = userDAO.getUserByUserName(userName);
		if (users != null && users.size() != 0) {
			if (users.get(0).getPassword().equals(password)) {
				//����û���������Ϸ����򷵻��û���������Ϣ�����򷵻�null
				return users.get(0);
			}
			else
			{
				return null;
			}
		}
		else	
		{
			return null;
		}
	}
    
	/**
	 * ��֤�û����Ƿ��Ѿ�����
	 * 
	 * @param �û���
	 * @return �����򷵻�true�����򷵻�false
	 */
	public boolean isUserExist(String userName) {
		List<User> users = userDAO.getUserByUserName(userName);
		if(users.size()!=0)
			return true;
		else
			return false;
	}
	//���¸�������
	public void updateUser(User user) {
		System.out.println("����");						
		// ����û���
		String userName = user.getUserName();
		// �����ݿ��в�ѯ�û���ΪuserName���û�
		List<User> users = userDAO.getUserByUserName(userName);
		System.out.println("����2");
		// ������ص��û���¼��ĿС�ڵ���0��˵�����û���������
		if (users.size() > 0) {
			// �����ݿ��������û�
			userDAO.updateUser(user);
			System.out.println("����3");
		} else {
			// �׳��쳣
			throw new RuntimeException("����ʧ�ܣ�");
		}
	}
}