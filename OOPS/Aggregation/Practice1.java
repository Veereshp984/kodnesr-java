package OOPS.Aggregation;
class Book {
    String title;
    String author;

    void displayBook(){
        System.out.println("Title : " + title);
        System.out.println("author : " + author);
    }
}
class Library {
    Book b = new Book();

    void showBook(){
        b.displayBook();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Library l = new Library();
        l.b.title = "veeru";
        l.b.author = "myself";
        l.showBook();
    }
}
