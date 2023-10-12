import Sub.A;
import Sub.E;

class C {
    int a;
    private int b;
    protected int c;

    void abc(){
        this.a = 10;
        this.b = 20;
    }

    private void xyz(){
        this.a = 10;
        this.b = 20;
    }
}

class D extends C{
    void abc(){
        this.a = 10;
        // this.b = 20; // This will give error as b is private
        this.c = 30;
    }
}

public class AccMod{
    public static void main(String[] args){

        System.out.println("A");
        A a = new A();
        // System.out.println(a.b); // This will give error as a is private
        System.out.println(a.a); // This will work as a is public
        a.abc(); // This will work as abc is public
        System.out.println(a.a);
        // a.xyz(); // This will give error as xyz is private
        // a.def(); // This will not work as def is default but in a diff package

        System.out.println("B");
        B b = new B();
        System.out.println(b.a); // This will work as a is default
        // System.out.println(b.b); // This will give error as b is private
        b.abc(); // This will work as abc is default
        System.out.println(b.a);
        // b.xyz(); // This will give error as xyz is private
        b.def(); // This will work as def is default
        System.out.println(b.a);

        System.out.println("C");
        C c = new C();
        System.out.println(c.a); // This will work as a is default
        // System.out.println(c.b); // This will give error as b is private
        c.abc(); // This will work as abc is default
        System.out.println(c.a);
        // c.xyz(); // This will not give error as xyz is private

        System.out.println("D");
        D d = new D();
        d.abc(); // This will work as abc is default
        System.out.println(d.a); // This will work as a is public
        // System.out.println(d.b); // This will give error as b is private
        System.out.println(d.c); // This will work as c is protected

        System.out.println("E");
        E e = new E();
        e.abc(); // This will work as abc is public
        System.out.println(e.a); // This will work as a is public
        // System.out.println(e.b); // This will give error as b is private
        // System.out.println(e.c); // This will work as c is protected

    }
}