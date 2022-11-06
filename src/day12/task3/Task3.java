package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Q", 1990);
        MusicBand band2 = new MusicBand("QW", 1991);
        MusicBand band3 = new MusicBand("QWE", 1992);
        MusicBand band4 = new MusicBand("QWER", 1993);
        MusicBand band5 = new MusicBand("QWERT", 1994);
        MusicBand band6 = new MusicBand("QWERTY", 2001);
        MusicBand band7 = new MusicBand("QWERTYU", 2002);
        MusicBand band8 = new MusicBand("QWERTYUI", 2003);
        MusicBand band9 = new MusicBand("QWERTYUIO", 2004);
        MusicBand band10 = new MusicBand("QWERTYUIOP", 2005);

        List<MusicBand> list = new ArrayList<>(Arrays.asList(band1,band2,band3,band4,band5,band6,band7,band8,band9,band10));

        groupsAfter2000(list);

        System.out.println(list);
        System.out.println(groupsAfter2000(list));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bands1 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if(bands.get(i).getYear() > 2000)
                bands1.add(bands.get(i));
        } return bands1;
    }
}
