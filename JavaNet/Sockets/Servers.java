import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servers {
    private static List<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) {
        int port = 8080; // Specify the port number

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            // Communication loop for handling multiple clients
            while (true) {
                // Wait for a client to connect
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Get the client's username
                BufferedReader usernameReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String username = usernameReader.readLine();
                System.out.println("Client username: " + username);

                // Setup communication streams
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
                clientWriters.add(writer);

                // Start a new thread to handle the client
                Thread clientThread = new Thread(() -> handleClient(clientSocket, username, writer));
                clientThread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket, String username, PrintWriter writer) {
        try {
            // Read and print initial messages from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            writer.println("Hello, " + username + "! This is the Java Chat Server.");
            writer.println("Enter CLOSE to exit.");
            writer.println("");
            writer.flush();
            // Flush is necessary to send the message immediately
            System.out.println("Sent welcome message to client: " + username);

            // Communication loop
            String message;
            while ((message = reader.readLine()) != null && !message.trim().equals("CLOSE")) {
                System.out.println("[" + username + "] Client: " + message);

                // Broadcast the message to all connected clients except the sender
                broadcast(username + ": " + message, writer);
            }

            // Remove the writer from the list when the client disconnects
            clientWriters.remove(writer);

            // Close resources for this client
            reader.close();
            writer.close();
            clientSocket.close();
            System.out.println("Client disconnected: " + clientSocket.getInetAddress().getHostAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void broadcast(String message, PrintWriter sender) {
        // Send the message to all connected clients except the sender
        for (PrintWriter writer : clientWriters) {
            if (writer != sender) {
                writer.println(message);
                writer.flush();
            }
        }
    }
}
