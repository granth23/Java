// Define an interface with a method signature
interface MyInterface {
    final int x = 10; // This is a constant

    public void myMethod();

    default void testMethod1() {
        System.out.println(this.x);
        System.out.println("This is a default method");
        // this.x = 10; // This will give error as x is final
    }

    static void testMethod2() {
        System.out.println("This is a static method");
    }
}

// Implement the interface in a class
class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementing myMethod() in MyClass");
    }
}

// Create an object of the implementing class and call the method
public class Interfaces {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.myMethod();
        obj.testMethod1(); // This will give error as testMethod is static
        MyInterface.testMethod2(); // This is how you call a static method

    }
}
