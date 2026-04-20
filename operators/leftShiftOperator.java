package operators;

public class leftShiftOperator {
    public static void main(String[] args) {
        var a = 32;
        var b = a >> 1;
        System.out.println(b);
        var c = b >> 1;
        System.out.println(c);
        var d = c >> 1;
        System.out.println(d);
        var e = d >> 1;
        System.out.println(e);
    }
}
