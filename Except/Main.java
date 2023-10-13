class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class Main {

    public static void main(String args[]) throws InvalidAgeException {
        try {
            int age = Integer.parseInt(args[0]);
            if (age < 18) {
                throw new InvalidAgeException("age is not valid to vote");
            } else {
                System.out.println("welcome to vote");
            }
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }
    }
}