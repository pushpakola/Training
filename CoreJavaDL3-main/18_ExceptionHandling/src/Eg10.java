
public class Eg10 {

	public static void main(String[] args) {

		try {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("try block");
		} finally {
			System.out.println("finally block");
		}

	}

}
