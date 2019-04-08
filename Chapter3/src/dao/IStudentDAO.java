package dao;

import java.util.List;
import domain.Student;

public interface IStudentDAO {
		//����һ��ѧ���û������ݿ�
		public void addStudent(Student student);
		//�����û���Ż�ȡ�û���Ϣ����Student�������ʽ����
		public Student getStudentByID(String id);
		//�����û�����ȡ�û���Ϣ����Student�������ʽ����
		public List<Student> getStudentByUserName(String userName);
		//����ѧ�Ų�ѯ���㣬�������
		//public Student getStudentByClass(String classes_id);
		//��ѯ����ѧ����Ϣ
		public List<Student> getAllStudent();
}