
public class Eg4 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			String s1 = null;
			System.out.println(s1.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}

}
