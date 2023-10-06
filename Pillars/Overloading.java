package Pillars;
public class Overloading {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void main(String[] args) {

        Overloading obj = new Overloading();

        int c = obj.sum(5, 4);
        System.out.println(c);

        double d = obj.sum(5.2, 4.2);
        System.out.println(d);

        foo(2000);
        foo(3000, 4000);

    }

}
