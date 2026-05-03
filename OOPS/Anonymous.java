package OOPS;

public class Anonymous {
    public static void main(String[] args) {
        new Student().study();
    }

}
class Student{
    int roll;
    String name;
    void study(){
        System.out.println("Studying");
    }
}
