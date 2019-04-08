package service.imp;

import java.util.List;
import dao.IInfoDAO;
import dao.imp.InfoDAO;
import domain.Information;
import service.IInfoService;

/**
 * Information���Ӧ��ҵ���߼��� �ṩҵ���߼�����
 */
public class InfoService implements IInfoService {
	/**
	 * ����IInfoDAO���͵����ԣ���ʵ��InfoService��IInfoDAOʵ����֮���Э��
	 */
	private IInfoDAO infoDAO=new InfoDAO();

	/**
	 * Ĭ�Ϲ��캯��
	 */
	public InfoService() {
		
	}

	/**
	 * �����ݿ��������Ϣ
	 */

	public void addInfo(Information information) {
		// �����ϢΪ�գ��򷵻أ��������
	if (information.getTitle() == null)
	     return;
		// ��ϢID��Ϊ�գ�˵������Ϣ�����ݿ����Ѵ��ڣ���Ӧ������Ӷ�Ӧ���Ǹ���
		// �����ݿ��������Ϣ
		infoDAO.addInfo(information);
	}

	/**
	 * ������ݿ���������Ϣ������List<Information>����
	 */
	public List<Information> getAllInfo() {
		return infoDAO.getAllInfo();
	}
			
}
