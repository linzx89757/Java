package service;

import java.util.List;
import domain.Classes;



public interface IClassesService {
		//����һ��������Ϣ�����ݿ�
		public void addClasses(Classes classes);
		//��ȡ������Ϣ�б�
		public List<Classes> getAllClasses();
}