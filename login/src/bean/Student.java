package bean;
import java.util.Date;

public class Student {

    private int id;             // �����ݿ��е�ID
    private int studentID;      // ѧ�ţ���ID���ֿ�Ϊ�˷������ݿ����
    private String name;        // ����
    private int age;            // ����
    private String sex;         // �Ա�
    private Date birthday;      // ��������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

   
}