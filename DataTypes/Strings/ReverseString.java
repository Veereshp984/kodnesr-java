package DataTypes.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "java";
        StringBuilder rev = new StringBuilder();
//        sb.reverse();
//        System.out.println(sb);
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        System.out.println(rev);
    }
}
