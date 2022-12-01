public class Eg11 {

	public static void main(String[] args) {
		
		
		new Eg11().m1();
	}
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m3();
	}
	
	public void m3() {
		
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			throw new RuntimeException("Runtime Exception occured: ", e);
			//System.out.println(e);
		}
	}

}
