package OOPS;

public class PersonApplication {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "veeru";
        p.age = 21;
        System.out.println(p.name);
        System.out.println(p.age);
        p.print();
        p.sleep();
    }
}