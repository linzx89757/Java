import java.util.*;
public class Example3_9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while(reader.hasNextDouble()) {
			double x = reader.nextDouble();
			assert x <= 100 && x >= 0 :"����һ���Ƿ��ĳɼ�";
			m = m + 1;
			sum = sum + x;
			
		}
		System.out.printf("%d�����ĺ�Ϊ%f\n",m,sum);
		System.out.printf("%d������ƽ��ֵ��%f\n",m,sum/m);
		
	}
}
