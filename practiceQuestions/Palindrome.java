package practiceQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        boolean isPalindrome = true;
        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not Palindrome");
        }
    }
}
