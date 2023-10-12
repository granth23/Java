
class Person {
    private String name;
    private int age;

    public String getName() {
        return name; // Getter
    }

    public void setName(String name) {
        this.name = name; // Setter
    }

    public int getAge() {
        return age; // Getter
    }

    public void setAge(int age) {
        this.age = age; // Setter
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
