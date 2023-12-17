import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {
    public static void main(String[] args){
        try {
            File file = new File("object.txt");
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            while (fileIn.available() > 0) {
                Object object = (Object) objectIn.readObject();
                System.out.println(object.print());
            }

            objectIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
