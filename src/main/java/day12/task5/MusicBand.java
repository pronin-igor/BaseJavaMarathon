package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(List<MusicArtist> members) {
        for (int i = 0; i < members.size(); i++) {
            this.members.add(members.get(i));
        }
    }

    public void removeMembers(List<MusicArtist> members) {
        // for (int i = 0; i < members.size(); i++) {
        //     int index = this.members.indexOf(members.get(i));
        //     System.out.println(index);
        //     // this.members.remove(index);
        // }
        this.members.removeAll(members);
    }

    public String toString() {
        return name + " " + year;
    }

    static public void transferMembers(MusicBand a, MusicBand b) {
        b.addMember(a.getMembers());
        a.removeMembers(a.getMembers());
    }

    public void printMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(name + " " + members.get(i));
        }
    }
}
