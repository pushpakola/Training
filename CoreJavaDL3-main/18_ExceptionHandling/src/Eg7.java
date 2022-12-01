
public class Eg7 {

	public static void main(String[] args) {
		
		try {
			
			int a = 10;
			int b = 2;
			System.out.println(a/b);
			
			int[] aa = {10,20,30,40,50};
			System.out.println(aa[2]);
			
			String s1 = "10";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
			
			String s2 = "Java";
			System.out.println(s2.length());
			
			String s3 = "Hello Java and Hello Python";
			System.out.println(s3.charAt(6));
			System.out.println(s3.charAt(40));
			
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
