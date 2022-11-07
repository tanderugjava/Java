package day12.task5;

import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members ;
    private MusicArtist musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return name + " " + year + " " + members;
    }

    public static void transferMembers(MusicBand band, MusicBand band1){
        for (int i = 0; i < band1.members.size(); i++) {
            band.members.add(band1.members.get(i));
        }
        band1.members.clear();
    }

    public void printMembers(){
        System.out.println(members);
        }

    public String getMembers(){
        String memb = "";
        for (int i = 0; i < this.members.size(); i++) {
            memb = memb + this.members.get(i) + " ";
            }
        return memb;
        }
    }