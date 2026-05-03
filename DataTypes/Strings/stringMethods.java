package DataTypes.Strings;

public class stringMethods {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "helloo";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1,3));
        System.out.println(s.equals(s1));
        System.out.println(s.indexOf('l'));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s1.contains("oo"));
        char arr[] = s.toCharArray();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String s3 = "a,b,c";
        String[] arr1 = s3.split(",");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
