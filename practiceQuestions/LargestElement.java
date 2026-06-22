package practiceQuestions;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {12,34,56,23,11,98};
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
