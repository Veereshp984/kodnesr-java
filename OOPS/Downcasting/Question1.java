package OOPS.Downcasting;
class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}
class Manager extends Employee {
    void work() {
        System.out.println("Manager is working...");
    }
    void approveLeave() {
        System.out.println("Leave Approved");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        Employee e1 = new Manager();
        e1.work();
        Manager m = (Manager)e1;
        m.approveLeave();
    }
}
