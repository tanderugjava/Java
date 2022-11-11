package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> member;

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
        band.member.addAll(band1.member);
        band1.member.clear();
    }

    public void printMembers(){
        for (String x: member) {
            System.out.print("'" + x + "'" + " ");
        }
    }

    public List<String> getMembers(){
        return member;
        }
    }