

public class E extends A {
    public void abc(){
        this.a = 10;
        // this.b = 20; // This will give error as b is private
        this.c = 30;
    }
}
