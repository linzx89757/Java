package chapter1.diary.bean;

public class Student {
	String name;
	int age;
	String sex;
	
	void takeNote() {
		System.out.println("����"+name);
		System.out.println("����"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("�ҿ�ʼ�Ǳʼ��ˡ�");
	}
	
	public static void main(String[] args) {
		//����һ����Ϊzhouxingxing��Student����
		Student zhouxingxing = new Student();
		//Ϊ�ö�������Ը�ֵ
		zhouxingxing.name = "Javaweb������";
		zhouxingxing.age = 20;
		zhouxingxing.sex ="��";
		//���øö����takeNote����
		zhouxingxing.takeNote();
				
		
		
	}
}
