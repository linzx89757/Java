package dao;

import java.util.List;

import domain.Information;

/**
 * Information���Ӧ��DAO�ӿڣ��ṩһЩ����Ϣ��ص����ݿ���ɾ��Ĳ����Ĺ����ķ�������
 * @author Administrator
 *
 */
public interface IInfoDAO {
	//�÷���ʵ������һ����Ϣ�����ݿ���
	public void addInfo(Information information);
	//�÷�����ȡ������Ϣ�б�
	public List<Information> getAllInfo();
	
	
}