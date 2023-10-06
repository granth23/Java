package other;

public class A {
    public void pub() {
        System.out.println("Public");
    }

    private void priv() {
        System.out.println("Private");
    }

    void def() {
        System.out.println("Hello");
    }

    protected void prot() {
        System.out.println("Hello");
    }

    private int salary(){
        return 2000;
    }

    public int getSal(){
        return salary();
    }

}
