
public class Eg1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Before");
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("After");

	}

}
