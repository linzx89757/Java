
public class Demo1 {
	public static void main(String args[]) {
		for (int i = 1;i <= 20;i++)
			System.out.println(f(i));
	}
	public static int f(int x) {
		if(x == 1|x == 2)
			return 1;
		else
			return f(x-1) + f(x-2);
	}
}
