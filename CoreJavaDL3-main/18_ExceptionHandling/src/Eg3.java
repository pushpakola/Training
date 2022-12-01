
public class Eg3 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			String s1 = "10";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("After");

	}

}
