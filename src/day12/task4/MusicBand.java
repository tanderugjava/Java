package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> member = new ArrayList<>();

    public MusicBand(String name, int year, List<String> member){
        this.name = name;
        this.year = year;
        this.member = member;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return name + " " + year + " " + member;
    }

    public static void transferMembers(MusicBand band, MusicBand band1){
        for (int i = 0; i < band1.member.size(); i++) {
            band.member.add(band1.member.get(i));
            band1.member.remove(i);
        }
    }

    public void printMembers(MusicBand band){
        band.member.toString();
    }

    public String getMembers(MusicBand band){
        String memb = "";
        for (int i = 0; i < band.member.size(); i++) {
            memb = memb + band.member.get(i) + " ";
            }
        return memb;
        }
    }