
public class Methods {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Methods obj = new Methods();
        int c = obj.sum(5, 4);
        System.out.println(c);
    }

}
