//����������������ɾ���ʹ�ӡѧ���ɼ�
package data;

import java.util.*;
import java.io.*;

public class CH03_02 {
	public static void main(String args[]) throws IOException {
		BufferedReader buf;
		Random rand = new Random();
		buf = new BufferedReader(new InputStreamReader(System.in));
		StuLinkedList list = new StuLinkedList();
		int i,j,findword = 0,data[][] = new int[12][10];
		String name[] = new String[] {"Allen","Scott","Marry","jon","mark","ricky","lisa","jasica","hanson","amy","bob","jack"};
		System.out.println("ѧ�ųɼ�ѧ�ųɼ�ѧ�ųɼ�ѧ�ųɼ�\n ");
		for(i = 0;i < 12;i++) {
			data[i][0] = i + 1;
			data[i][1] = (Math.abs(rand.nextInt(50))) + 50;
			list.insert(data[i][0], name[i], data[i][1]);
		}
		for(i = 0;i < 3;i++) {
			for(j = 0; j < 4;j++) {
				System.out.print("[" + data[j * 3 +i][0] + "][" +data[j * 3 + i][1] + "] ");				
			}
			System.out.println( );
		}
		while(true) {
			System.out.print("����Ҫɾ���ɼ���ѧ�ţ���������-1�� ");
			findword = Integer.parseInt(buf.readLine());
			if(findword == -1) {
				break;
			}else {
				Node current = new Node(list.getFirst().data,list.getFirst().names,list.getFirst().np);
				while(current.data != findword) {
					current = current.next;
				}
				list.delete(current);
			}
			System.out.println("ɾ����ɼ��б�����ע�⣡Ҫɾ���ĳɼ���ѧ�ű���Ҫ�ڴ��б���\n");
			list.print();
		}
		
	}

}