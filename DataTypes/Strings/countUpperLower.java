package DataTypes.Strings;

public class countUpperLower {
    public static void main(String[] args) {
        String s = "HeLLo";
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upperCount++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {

                lowerCount++;
            }

        }
        System.out.println(lowerCount);
        System.out.println(upperCount);
    }
}

