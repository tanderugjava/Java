package day12.task4;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersband = new ArrayList<>(Arrays.asList("Ivan Petrov", "Petr Ivanov"));
        MusicBand band = new MusicBand("Group", 2020, membersband);
        band.getMembers(band);
        System.out.println(band);
        List<MusicBand> list = new ArrayList<>();
        System.out.println(band.getMembers(band));
        band.printMembers(band);
    }
}
