abstract class Sunstar {

    int num;
    public Sunstar(int num){
        this.num = num;
    }

    public void Printing(){
        System.out.println(this.num);
    }

    // Abstract method (does not have a body)
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    public Employee(){
        super(10);
        super.Printing();
        System.out.println("This is a constructor");
    }

    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

// Base class
class Abstraction {
    public static void main(String args[])
    {
        Sunstar s = new Employee();
        s.printInfo();
    }
}