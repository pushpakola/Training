class JDBC {

	static {
		System.out.println("JDBC Driver Connected");
	}
}

public class Eg6 {

	public static void main(String[] args) {

		try {
			Class.forName("JDBC");
		} catch (ClassNotFoundException e) {

			System.out.println(e);
		}
	}

}
