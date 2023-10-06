class Vehicle {
    Vehicle(){
        System.out.println("Vehicle's Constructor");
    }
    int maxSpeed = 120;
}
class Car extends Vehicle {
    Car(){
        super();
        System.out.println("Car's constructor called");
    }
    int maxSpeed = 180;
    void display()
    {
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
class superSuper {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}