package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10001);
        }
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < (numbers.length - 2); i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSumIdx);
    }
}
