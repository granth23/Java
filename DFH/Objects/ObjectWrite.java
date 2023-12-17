import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
    public static void main(String[] args) {
        try {
            Object object1 = new Object("Object 1", "This is an object");
            Object object2 = new Object("Object 2", "This is an object");
            File file = new File("object.txt");

            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(object1);
            objectOut.writeObject(object2);

            objectOut.close();
            fileOut.close();

            System.out.println("Object has been written to file");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
