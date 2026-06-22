package OOPS.Downcasting;
class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }
    void openSunroof() {
        System.out.println("Sunroof Opened");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        Car c = (Car) v;
        c.openSunroof();
    }
}
