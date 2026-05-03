package DataTypes.Strings;

public class countDigits {
    public static void main(String[] args) {
        String s = "a1b2cc3";
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
