package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Mercedes", "Bmw", "Audi", "Lexus", "Porsche"));
        System.out.println(list);
        list.add(2,"Kia");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
