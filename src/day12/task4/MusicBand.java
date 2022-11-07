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
        for (int i = 0; i < band1.member.size(); i++) {
            band.member.add(band1.member.get(i));
            band1.member.remove(i);
        }
    }

    public void printMembers(){
        for (String x: member) {
            System.out.print("'" + x + "'" + " ");
        }
    }

    public String getMembers(){
        String memb = "";
        for (int i = 0; i < this.member.size(); i++) {
            memb = memb + this.member.get(i) + " ";
            }
        return memb;
        }
    }