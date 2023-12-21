package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void addMember(List<String> members) {
        for (int i = 0; i < members.size(); i++) {
            this.members.add(members.get(i));
        }
    }

    public void removeMembers(List<String> members) {
        for (int i = 0; i < members.size(); i++) {
            int index = this.members.indexOf(members.get(i));
            this.members.remove(index);
            i--;
        }
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
