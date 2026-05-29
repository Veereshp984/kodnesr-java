package OOPS.InnerClass.StaticMember;

public class Program1 {
    int a = 10;
    static class Program2 {
        static int b = 20;
        static void display(){
            System.out.println(b);
        }
    }
    void display1() {
        System.out.println(a);
        Program2.display();
    }
}
