package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numbers = new int[12][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(51);
            }
        }
        int[] s = new int[12];

        for (int i = 0; i < numbers.length; i++) {
            int d = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                d += numbers[i][j];
            }
            s[i] = d;
        }
        int a = 0;
        int b = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] >= a){
                a = s[i];
                b = i;
            }
        }
        System.out.println(b);
    }
}
