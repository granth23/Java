public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        try {
            b = 100 / a;
            System.out.println("b = " + b);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int nums[] = new int[5];

        try {
            System.out.println("nums[5] = " + nums[5]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}