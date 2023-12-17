import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Clients {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8080);

            // Setup communication streams
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Input from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            // Get the client's username
            System.out.print("Enter your username: ");
            String username = userInput.readLine();

            // Send the username to the server
            writer.println(username);

            // Start a separate thread to handle messages from the server
            Thread serverListener = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            serverListener.start();

            // Communication loop
            do {
                message = userInput.readLine();
                writer.println(message);
                // Check for exit condition
                if ("CLOSE".equals(message)) {
                    System.out.println("Closing client connection.");
                    break;
                }
            } while (true);

            // Close resources
            userInput.close();
            reader.close();
            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
