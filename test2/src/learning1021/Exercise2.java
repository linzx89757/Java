package learning1021;

import java.io.File;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File dirFile = new File(".");
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");
		String fileName[] = dirFile.list(fileAccept);
		for(String name : fileName) {
			System.out.println(name);
		}
	}

}
