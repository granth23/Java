import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("myfile.txt");
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}

			reader.close();
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
