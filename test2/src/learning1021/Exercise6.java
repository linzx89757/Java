package learning1021;

import java.io.*;

public class Exercise6 {
	public static void main(String[] args) {
		File sourceFile =new File("a.txt");
		File targetFile =new File("b.txt");
		char c [] =new char[19];
		
		try {
			Writer out =new FileWriter(targetFile,true); //ָ��Ŀ�ĵص������
			Reader in =new FileReader(sourceFile);		//ָ��Դ��������
			 int n =-1;
			 while((n =in.read(c)) != -1) {
				 out.write(c,0,n);
			 }
			out.flush();
			out.close();
		}
		catch(IOException e) {
			System.out.println("Error" + e);
		}
	}
}
