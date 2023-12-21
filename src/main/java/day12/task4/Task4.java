package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("Member a");
        members.add("Member b");
        members.add("Member c");

        MusicBand band = new MusicBand("Sum 41", 1990, members);

        List<String> members2 = new ArrayList<>();
        members2.add("Member d");
        members2.add("Member e");
        members2.add("Member f");

        MusicBand band2 = new MusicBand("Blink 182", 1995, members2);

        band.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band, band2);

        band.printMembers();
        band2.printMembers();
    }
}
