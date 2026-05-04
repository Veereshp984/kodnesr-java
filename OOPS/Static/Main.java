package OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        System.out.println("No of Objects created :" + Demo.count );
    }
}
