package service.imp;

import java.util.List;

import dao.IClassesDAO;
import dao.imp.ClassesDAO;
import domain.Classes;
import service.IClassesService;

public class ClassesService implements IClassesService{
	//����IClassesService���͵����ԣ���ʵ��IClassesService��IClassesDAOʵ����֮���Э��
	private IClassesDAO classesDAO = new ClassesDAO();
	
	public ClassesService() {
		// TODO Auto-generated constructor stub
	}
	
	//����һ���༶��Ϣ�����ݿ�
	public void addClasses(Classes classes) {
		//����༶Ϊ�գ��򷵻أ���������
		if(classes.getClasses_id() == null) 
			return ;
		
			classesDAO.addClasses(classes);
	}
	//��ȡ������Ϣ�б�
	public List<Classes> getAllClasses(){
		return classesDAO.getAllClasses();
	}
}