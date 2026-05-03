package DataTypes.Strings;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("d");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
