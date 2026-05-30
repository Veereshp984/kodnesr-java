package OOPS.Upcasting;

import java.awt.image.PixelGrabber;

class Food {
    void prepare() {
        System.out.println("Preparing food...");
    }
}
class Pizza extends Food {
    void prepare() {
        System.out.println("Preparing Pizza...");
    }
}
class Burger extends Food {
    void prepare() {
        System.out.println("Preparing Burger...");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Food p = new Burger();
        p.prepare();
        Food p1 = new Pizza();
        p1.prepare();
    }
}
