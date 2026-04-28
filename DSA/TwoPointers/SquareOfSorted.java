package DSA.TwoPointers;

public class SquareOfSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = new int[arr.length];
        int k =0;
        for(int i=0;i<= arr.length-1;i++){
            k = arr[i] * arr[i];
            result[i] = k;
        }
        for(int i =0;i<= result.length-1;i++){
            System.out.print(result[i] + "  ");
        }
    }
}
