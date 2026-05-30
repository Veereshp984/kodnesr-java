package OOPS.Upcasting;
class Media {
    void play() {
        System.out.println("Playing media.");
    }
}
class song extends Media {
    void play() {
        System.out.println("Playing Song");
    }
}
class Movie extends Media {
    void play() {
        System.out.println("Playing Movie");
    }
}
public class question2 {
    public static void main(String[] args) {
        Media m = new song();
        m.play();
        Media m1 = new Movie();
        m1.play();
    }
}
