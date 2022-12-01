import java.io.File;
import java.io.IOException;

public class Eg9 {

	public static void main(String[] args) {
		
		File f = new File("two.txt");
		try {
			f.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Used for Closing the resources");
		}

	}

}
