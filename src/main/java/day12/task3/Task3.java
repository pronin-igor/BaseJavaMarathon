package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Sum 41", 1990));
        list.add(new MusicBand("Blink 182", 1995));
        list.add(new MusicBand("Linking Park", 2000));
        list.add(new MusicBand("Nervana", 2005));
        list.add(new MusicBand("Our Last Night", 2010));
        list.add(new MusicBand("ColdPlay", 2015));
        list.add(new MusicBand("Sunrise Avenu", 2020));
        list.add(new MusicBand("PLTS", 2025));
        list.add(new MusicBand("Thirty second to Mars", 2030));
        list.add(new MusicBand("Red hot chili papers", 2035));
        Collections.shuffle(list);
        List<MusicBand> after2000List = groupsAfter2000(list);
        System.out.println(list);
        System.out.println(after2000List);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                list.add(bands.get(i));
            }
        }
        return list;
    }
}
