package ru.alishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>(Arrays.asList("Rock song1", "Rock song2", "Rock song3"));

    @Override
    public String getSong() {
        var random = new Random().nextInt(songs.size());
        return songs.get(random);
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
