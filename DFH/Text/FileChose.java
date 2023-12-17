import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileChose {
    public static void main(String[] args) {
        // Create a JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Show the open dialog
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            try {
                FileReader reader = new FileReader(path);
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
}
