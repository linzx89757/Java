package learning1021;

import java.io.*;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File file = new File("Exercise1.java");
		System.out.println(file.getName() +"�ǿɶ�����" + file.canRead());
		System.out.println(file.getName() + "�ĳ��ȣ� " +file.length());
		System.out.println(file.getName() + "�ľ���·��" + file.getAbsolutePath());
		File file2 = new File("E:\\code","new.txt");
		System.out.println("�ڵ�ǰĿ¼�´������ļ�" + file2.getName());
		if(!file2.exists()) {
			try {
				file2.createNewFile();
				System.out.println("�����ɹ���");
			}
			catch(IOException exp) {
				System.out.println("error");
			}
			
		}
		file2.delete();
		if(file2.exists()) {
			System.out.println("�һ��ڣ�");
		}else {
			System.out.println(file2.getName()+"����");
		}
		
		
	}

}
