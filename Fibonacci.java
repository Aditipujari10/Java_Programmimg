public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int n = 20;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n;i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
