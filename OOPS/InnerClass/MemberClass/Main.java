package OOPS.InnerClass.MemberClass;

public class Main {
    public static void main(String[] args) {
        Program1.Program2 p2 = new Program1().new Program2();
        p2.display();
    }
}
