package OOPS.Upcasting;

class Notification {
    void send() {
        System.out.println("Notification sent!");
    }
}

class Email extends Notification {
    void send() {
        System.out.println("Email sent!");
    }
}

class SMS extends Notification {
    void send() {
        System.out.println("SMS sent!");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Notification n = new Notification();
        n.send();
        Notification email = new Email();
        email.send();
        Notification sms = new SMS();
        sms.send();
    }
}
