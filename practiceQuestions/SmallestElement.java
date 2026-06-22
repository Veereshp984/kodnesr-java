package practiceQuestions;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {12,34,56,78,23};
        int min = arr[0];
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
