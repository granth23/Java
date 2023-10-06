package Basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int a = sc.nextInt();

        System.out.println("Name: " + str);
        System.out.println("Age: " + a);

        sc.close();
    }
}
