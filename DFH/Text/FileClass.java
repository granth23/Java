import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("myfile.txt");

        System.out.println("The absolute path is: " + file.getAbsolutePath());
        System.out.println("The file exists: " + file.exists());
        System.out.println("File name is: " + file.getName());
        System.out.println("Length of content: " + file.length());
        System.out.println("Can you read data from the file: " + file.canRead());
        System.out.println("Can you write data into the file: " + file.canWrite());

    }
}
