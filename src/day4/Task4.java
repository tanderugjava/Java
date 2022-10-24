package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10001);
        }
        int[] max = new int[98];
        for(int i = 0; i < (numbers.length - 2); i++){
            max[i] = numbers[i] + numbers[i+1] + numbers[i+2];
        }
        int a = 0;
        for (int i = 0; i < (max.length-1); i++){
            if(max[i+1] > max[i]){
                a = i;
            }
        }
        System.out.println(a);
    }
}
