package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1};
        System.out.println(recursionSum(numbers, numbers.length-1));
    }
    public static int recursionSum(int[] numbers, int n){
        if(n == 0){
            return numbers[n];
        }
     return numbers[n] + recursionSum(numbers, n-1);
    }
}
