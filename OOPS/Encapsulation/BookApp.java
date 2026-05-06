package OOPS.Encapsulation;

public class BookApp {
    public static void main(String[] args) {
        // process of providing the controlled access to the
        // private data members of the class using the member functions.
        //or
//        process of putting the data(variables) and methods(functions) together inside one class and hiding the
//        internal details from other class
        Book b = new Book();
        b.getData(100);
        b.setData();
    }
}
