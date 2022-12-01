
public class Eg8 {

	public static void main(String[] args) {
		
		getCustomerName("Admins");
	}

	private static void getCustomerName(String string) {
		
		try {
			if(string != "Admin") {
				throw new Exception("Execution failed due to name mistake");
			}else {
				System.out.println(string);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
