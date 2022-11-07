package day12.task4;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersband = new ArrayList<>(Arrays.asList("Ivan Petrov", "Petr Ivanov"));
        MusicBand band = new MusicBand("Group", 2020, membersband);
        System.out.println(band);

        List<String> membersband1 = new ArrayList<>(Arrays.asList("Oleg Olegov", "Anton Antonov"));
        MusicBand band1 = new MusicBand("Group1", 1990, membersband1);

        MusicBand.transferMembers(band, band1);

        band.printMembers();
        band1.printMembers();

        System.out.println();
        System.out.println(band.getMembers());
    }
}
