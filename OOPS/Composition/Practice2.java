package OOPS.Composition;
class Customer {
    String customerName;
    long accountNumber;

    void displayCustomer() {
        System.out.println("Name: " + customerName);
        System.out.println("A/c No: "+ accountNumber);
    }
}

class Bank {
    Customer customer;

    void addCustomer(Customer newCustomer){
        customer = newCustomer;
    }
    void showCustomerDetails(){
        customer.displayCustomer();
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.customerName = "Veeresh";
        c.accountNumber = 789944902;

        Bank b = new Bank();
        b.addCustomer(c);
        b.showCustomerDetails();
    }
}
