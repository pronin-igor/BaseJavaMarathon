package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Member a", 1));
        members.add(new MusicArtist("Member b", 2));
        members.add(new MusicArtist("Member c", 3));

        MusicBand band = new MusicBand("Sum 41", 1990, members);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Member d", 4));
        members2.add(new MusicArtist("Member e", 5));
        members2.add(new MusicArtist("Member f", 6));

        MusicBand band2 = new MusicBand("Blink 182", 1995, members2);

        band.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band, band2);

        band.printMembers();
        band2.printMembers();
    }
}
