package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist musicArtist1 = new MusicArtist("Ivan Petrov",30);
        MusicArtist musicArtist2 = new MusicArtist("Petr Ivanov",35);
        MusicArtist musicArtist3 = new MusicArtist("Oleg Olegov",51);
        MusicArtist musicArtist4 = new MusicArtist("Anton Antonov",27);



        List<MusicArtist> membersband1 = new ArrayList<>(Arrays.asList(musicArtist1, musicArtist2));
        MusicBand band = new MusicBand("Group", 2020, membersband1);




        List<MusicArtist> membersband2 = new ArrayList<>(Arrays.asList(musicArtist3, musicArtist4));
        MusicBand band1 = new MusicBand("Group1", 1990, membersband2);

        band.printMembers();
        band1.printMembers();

        MusicBand.transferMembers(band, band1);

        band.printMembers();
        band1.printMembers();


    }
}
