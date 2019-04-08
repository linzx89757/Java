package chapter1.diary.bean;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Test {
	
	public static void main(String[] args) {
		
		// �ô������Ĺ��캯������һ��User��Ķ���
		User user = new User("java������","��",20);
		
		// ����һ��ArrayList����������Diary
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		
		for(int i=1;i<4;i++){
			// ��������
			String authorName = user.getName();
			// �ռǱ���
			String title = "��" + i + "ƪ�ռ�";
			// �ռ�����
			String content = "��" + i + "ƪ�ռǵ�����";
			// �ռ�ʱ��
			GregorianCalendar time = new GregorianCalendar();

			// ����һ���ռ�
			Diary diary = new Diary(authorName, content, time, title);
			// ���ռǷ���diaries��
			diaries.add(diary);

		}
		
		// �������diaries�������ռǵ���Ϣ
		for (Diary diary : diaries) {
			System.out.println("�ռ�����:" + diary.getAuthorName());
			System.out.println("�ռǱ���:" + diary.getTitle());
			System.out.println("�ռ�����:" + diary.getContent());

			// �õ������ռ�ʱ����ꡢ�¡��ա�ʱ����
			GregorianCalendar time = diary.getTime();
			int year = time.get(GregorianCalendar.YEAR);
			int month = time.get(GregorianCalendar.MONTH)+1;
			int day = time.get(GregorianCalendar.DATE);
			int hour = time.get(GregorianCalendar.HOUR_OF_DAY);
			int minute = time.get(GregorianCalendar.MINUTE);

			System.out.println("�ռ�ʱ��:" + year + "-" + month + "-" + day + " " + hour + ":" + minute);
			System.out.println("****************************");
	}

	}
}
