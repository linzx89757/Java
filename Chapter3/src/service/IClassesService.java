package service;

import java.util.List;
import domain.Classes;
import domain.User;



public interface IClassesService {
		//���һ��������Ϣ�����ݿ�
		public void addClasses(Classes classes);
		//��ȡ������Ϣ�б�
		public List<Classes> getAllClasses();
		//���¸�������
				public void updateClasses(Classes classes);
				
			//���ݰ༶���ɾ���༶
				public void deleteClasses(String classes_id);
}
