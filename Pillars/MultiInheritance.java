
interface Parent1 {
    default void fun() {
        System.out.println("Parent1");
    }
}

interface Parent2 {
    default void fun() {
        System.out.println("Parent2");
    }
}


class MultiInheritance implements Parent1,Parent2{

    public void fun(){
        Parent1.super.fun();
        Parent2.super.fun();
    }
    public static void main(String args[]) {

        MultiInheritance t = new MultiInheritance();

        t.fun();
    }
}
