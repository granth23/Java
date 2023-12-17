import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("myfile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(Writer);
            bufferedWriter.write("Files in Java are seriously good!!");
            bufferedWriter.close();
            System.out.println("Successfully Appended.");
        } catch (Exception e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
