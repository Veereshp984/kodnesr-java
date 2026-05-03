package DataTypes.Strings;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "aabbcde";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for(int i=0;i < arr.length; i++){
            char ch = arr[i];
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }

    }
}
