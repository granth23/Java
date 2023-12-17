import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}

public class Formatters {
    private Formatter output;
    private Scanner input = new Scanner(System.in);

    public void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public void addRecords() {
        Account[] accounts = {
                new Account("John", 100),
                new Account("Mary", 200),
                new Account("Jane", 300)
        };

        for (Account account : accounts) {
            output.format("%s %d\n", account.getName(), account.getBalance());
        }
    }

    public void closeFile() {
        if (output != null) {
            output.close();
        }
    }

    public void readRecords() {
        Account[] accounts = new Account[100];
        try {
            input = new Scanner(new File("clients.txt"));

            int i = 0;
            while (input.hasNext()) {
                String name = input.next();
                int balance = input.nextInt();
                accounts[i] = new Account(name, balance);
                System.out.printf("%s %d\n", name, balance);
                i++;
            }
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Formatters formatters = new Formatters();
        formatters.openFile();
        formatters.addRecords();
        formatters.closeFile();
        formatters.readRecords();
    }
}
