import java.io.*;
//��������������˵Ľ��
public class CH02_03 {
	public static void main (String args[]) throws IOException {
		int M,N,P;
		int i,j;
		String StrM;
		String StrN;
		String StrP;
		String tempstr;
		
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���������A��ά����M,N��: ");
		System.out .print("�����������A��Mֵ�� ");	
		StrM =keyin.readLine();
		M = Integer.parseInt(StrM);	
		
		System.out.print("�����������A��Nֵ�� ");
		StrN = keyin.readLine();
		N = Integer.parseInt(StrN);
		
		int A[][] =new int[M][N];
		System.out.print("[���������A�ĸ���Ԫ��]");
		System.out.println("ע�⣡ÿ����һ��ֵ����Enter��ȷ������");
		
		for(i = 0;i < M;i++) {
			for(j = 0;j<N;j++) {
				System.out.print("a" + i + j +"=");
				tempstr=keyin.readLine();
				A[i][j] = Integer.parseInt(tempstr);
				}
			
		}
		
		System.out.println("���������B��ά����N,P��: ");
		System.out.print("�����������B��Nֵ�� ");
		StrN = keyin.readLine();
		N = Integer.parseInt(StrN);
		System.out.print("�����������B��Pֵ�� ");
		StrP = keyin.readLine();
		P = Integer.parseInt(StrP);
		
		int B[][] = new int[N][P];
		System.out.print("[���������	B�ĸ���Ԫ��]");
		System.out.println("ע�⣡ÿ����һ��ֵ����Enter��ȷ������");
		
		for(i = 0;i < N;i++) {
			for(j = 0;j<P;j++) {
				System.out.print("b" + i + j +"=");
				tempstr=keyin.readLine();
				B[i][j] = Integer.parseInt(tempstr);
				}
		}
		 int C[][] = new int[M][P];
		 MatrixMultiply(A,B,C,M,N,P);
		 System.out.println("[A*B�Ľ����]");
		 for(i = 0;i < M;i++) {
				for(j = 0;j<P;j++) {
					System.out.print(C[i][j]);
					System.out.print('\t');
					}
				System.out.println();
			}
	}

	public static void MatrixMultiply(int[][] arrA, int[][] arrB, int[][] arrC, int M, int N, int P) {
		// TODO �Զ����ɵķ������
		int i,j,k,Temp;
		if(M <= 0 || N <= 0||P <= 0) {
			System.out.println("[����ά��M,N,P�������0]");
			return;
		}
		for(i = 0;i < M;i ++){
			for(j = 0;j < P;j++) {
				Temp =0;
				for(k = 0;k < N;k++) {
					Temp =Temp +arrA[i][k] * arrB[k][j];
				}
				arrC[i][j] =Temp;
			}
			
		}
	}
}
