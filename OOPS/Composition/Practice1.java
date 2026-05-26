package OOPS.Composition;

class Professor {
    String name;
    String subject;

    void displayProfessorDetails(){
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
class University{
    Professor professor;

    void assignProfessor(Professor newProfessor){
        professor = newProfessor;
    }
    void showProfessor(){
        professor.displayProfessorDetails();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.name = "Veeresh";
        p.subject = "JAVA";

        University u = new University();
        u.assignProfessor(p);
        u.showProfessor();
    }
}
