package service;

import java.util.List;
import domain.Information;

/**
 * Information��Ӧ��ҵ���߼��ӿڣ��ṩһЩ����Ϣ��ص�ҵ���߼������Ĺ����ķ�������
 */
public interface IInfoService {
	
	//���һ��������Ϣ�����ݿ�
	public void addInfo(Information information);

	//��ȡ������Ϣ�б�
	public List<Information> getAllInfo();
}
