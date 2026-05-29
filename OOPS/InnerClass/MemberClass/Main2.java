package OOPS.InnerClass.MemberClass;

public class Main2 {
    public static void main(String[] args) {
        Program1 p1 = new Program1();
        Program1.Program2 p2 = p1.new Program2();
        p2.display();
    }
}
