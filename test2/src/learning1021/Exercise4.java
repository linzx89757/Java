package learning1021;
import java.io.*;
//ʹ���ļ��ֽ�����ȡ�ļ�������

public class Exercise4 {

	public static void main(String args[]) {
		// TODO �Զ����ɵķ������
		int n = -1;
		byte [] a = new byte[100];
		
		try {
				File f = new File("Exercise4.java");
				System.out.println("�ļ����� " +f.getName());
				System.out.println("·����"+ f.getAbsolutePath());
				//Ҫʹ�����·��
				InputStream in = new FileInputStream("src\\learning1021\\Exercise4.java");
				//FileInputStream in = new FileInputStream(f);
				while((n = in.read(a,0,100)) != -1) {
					String s = new String(a,0,n);
					System.out.print(s);
				}
				in.close();
		}
		catch(IOException e){
			System.out.println("File read Error " + e);
		}
	}

}
