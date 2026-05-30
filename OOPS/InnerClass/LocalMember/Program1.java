package OOPS.InnerClass.LocalMember;

public class Program1 {
    int a = 10;
    public void MyMethod(){
        class Program2 {
            int b = 20;
            void display1(){
                System.out.println(b);
            }
        }
        Program2 p2 = new Program2();
        p2.display1();
    }
    void display2() {
        System.out.println(a);
    }
}
