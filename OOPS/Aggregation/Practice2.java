package OOPS.Aggregation;
class Engine {
    String name;
    String model;
    void vehicleDetails(){
        System.out.println("Name : " + name);
        System.out.println("Model : " + model);

    }
    void startEngine(){
        System.out.println("engine started");
    }
}
class Car {
    Engine engine = new Engine();
    void startCar(){
        engine.startEngine();
    }
    void carRun(){
        System.out.println("car started and running");
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.engine.name = "Volvo";
        c.engine.model = "SUV";
        c.engine.vehicleDetails();
        c.engine.startEngine();
        c.carRun();
    }
}
