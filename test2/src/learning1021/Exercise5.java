package learning1021;

import java.io.*;

public class Exercise5 {
	public static void main(String args[]) {
		byte [] a = "�������".getBytes();
		byte [] b = "Happy New Year".getBytes();
		File file = new File("a.txt");				 //1.���Ŀ�ĵ�
		try {
			OutputStream out = new FileOutputStream(file);		//2.ָ��Ŀ�ĵص������
			System.out.println(file.getName() + "�Ĵ�С�� "+ file.length() +"�ֽ�");    //a.txt �Ĵ�С�� 0�ֽ�
			out.write(a);									//4.��Ŀ�ĵ�д������
			out.close();										//5.�ر�������
			out = new FileOutputStream(file,true);  //׼�����ļ�β������
			System.out.println(file.getName() + "�Ĵ�С�� " + file.length() + "�ֽ�");	//a.txt�Ĵ�С��8�ֽ�
			out.write(b,0,b.length);
			System.out.println(file.getName() + "�Ĵ�С�� " + file.length() + "�ֽ�");  //a.txt��1��С��22�ֽ�
			 out.close();
			
		}
		catch(IOException e){
			System.out.println("Error " + e);
		}
		
	}
}
