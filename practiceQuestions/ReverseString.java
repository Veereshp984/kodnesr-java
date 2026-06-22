package practiceQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
