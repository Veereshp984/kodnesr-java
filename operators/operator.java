package operators;

public class operator {
    public static void main(String[] args) {
        var a = 10;
        var b = 5;
        var c = a+ b;
        System.out.println("a+b" + "=" + c);
         c = a- b;
        System.out.println("a-b" + "=" + c);
         c = a* b;
        System.out.println("a*b" + "=" + c);
         c = a/ b;
        System.out.println("a/b" + "=" + c);
         c = a% b;
        System.out.println("a%b" + "=" + c);

        System.out.println("=============================================================");

        var d = a ==b;
        System.out.println("a==b ?" + d);

        d = a> b;
        System.out.println("a>b ?"+d);
        d = a< b;
        System.out.println("a<b ?"+d);
        d = a>= b;
        System.out.println("a>=b ?"+d);
        d = a<= b;
        System.out.println("a<=b ?"+d);
        d = a!= b;
        System.out.println("a!=b ?"+d);

        System.out.println("===================================================================");

        var e = true;
        var f = false;
        var g = e && e;
        System.out.println(g);
        g= e &&f;
        System.out.println(g);
        g= f &&e;
        System.out.println(g);
        g= f &&f;
        System.out.println(g);
        g= e ||f;
        System.out.println(g);
        g= f||e;
        System.out.println(g);
        g= e ||e;
        System.out.println(g);
        g= f ||f;
        System.out.println(g);

        g = 10>20 || 10< 20;
        System.out.println(g);

        g= (10<20 && 5 > 3) || (5 > 20 || 5 > 20);
        System.out.println(g);
    }
}
