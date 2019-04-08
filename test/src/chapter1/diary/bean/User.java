package chapter1.diary.bean;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class User {
	private String name;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public User() {
		super();
	}

	public static void main(String[] args) {
		//�ô������Ĺ��캯������һ��User��Ķ���
		User user = new User("Javaweb������","��",20);
		//����һ��ArrayList,��������Diary
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		//���δ���5��Diary����diaries��
		for(int i = 1;i < 4;++i) {
			String authorName = user.getName();
			String title = "��" + i + "ƪ�ռ�";
			String content ="��" + i + "ƪ�ռǵ�����";
			GregorianCalendar time = new GregorianCalendar();
			//����һ���ռ�
			Diary diary = new Diary(authorName,content,time,title);
			//���ռǷ���diaries��
			diaries.add(diary);
					
		}
		for(Diary diary : diaries) {
			System.out.println("�ռ����ߣ�" + diary.getAuthorName());
			System.out.println("�ռǱ��⣺" + diary.getTitle());
			System.out.println("�ռ����ݣ�" + diary.getContent());
			//�õ������ռǵ�������ʱ��
			GregorianCalendar time = diary.getTime();
			int year = time.get(GregorianCalendar.YEAR);
			int month = time.get(GregorianCalendar.MONTH) + 1;
			int day = time.get(GregorianCalendar.DATE);
			int hour = time.get(GregorianCalendar.HOUR_OF_DAY);
			int minute = time.get(GregorianCalendar.MINUTE);
			
			System.out.println("�ռ�ʱ�䣺" + year + "-" + month + "-" + day + "-" + hour + ":" + minute);
			System.out.println("****************************************");
			
			
		}
		
	}
}
