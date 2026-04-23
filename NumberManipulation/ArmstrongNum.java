package NumberManipulation;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int og = n;
        int sum = 0;
       while(n != 0){
           int ld = n % 10;
           sum += ld * ld * ld;
           n /= 10;
       }
        if(og == sum){
            System.out.println("the given number is armstrong number");
        }else{
            System.out.println("the given number is not a armstrong number");
        }
    }
}
