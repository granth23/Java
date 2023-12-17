import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileInfo {
	public static void main(String[] args)	{
		try {
			File Obj = new File("myfile.txt");

            System.out.println("File Name: " + Obj.getName());
            System.out.println("Absolute Path: " + Obj.getAbsolutePath());
            System.out.println("Writeable: " + Obj.canWrite());
            System.out.println("Readable: " + Obj.canRead());
            System.out.println("File Size in Bytes: " + Obj.length());

			// Scanner Reader = new Scanner(Obj);

			// while (Reader.hasNextLine()) {
			// 	String data = Reader.nextLine();
			// 	System.out.println(data);
			// }

			// Reader.close();

		} catch (Exception e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}
}
