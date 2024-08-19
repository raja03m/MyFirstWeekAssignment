package weekendDay1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.println(a + "\r" + b);
		for (int c = 2; c < 8; c++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
