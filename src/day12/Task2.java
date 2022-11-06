package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Range1(0, 30, list);
        Range1(300, 350, list);
        System.out.println(list);
    }
    public static void Range1(int a, int b, List<Integer> list){
        for (int i = a; i <= b; i++){
            if(i % 2 == 0)
                list.add(i);
        }
    }
}
