
class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }

    public static void oop(){
        System.out.println("I am a static method");
        // System.out.println(getSalary());
        Employee e1 = new Employee();
        e1.name = "Harry";
        e1.id = 12;
        e1.salary = 34;
        e1.printDetails();

    }

}

public class OOPS {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 130;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 100;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();

        System.out.println(john.getSalary());
        System.out.println(john.salary);

        // john.oop();
        Employee.oop();

    }
}