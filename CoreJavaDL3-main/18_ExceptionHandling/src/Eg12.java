
public class Eg12 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block");
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block");
		}
	}
}
