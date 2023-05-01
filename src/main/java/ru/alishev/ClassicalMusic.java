package ru.alishev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>(
            Arrays.asList("Classical song1", "Classical song2", "Classical song3")
    );

    @PostConstruct
    public void init() {
        System.out.println("init method...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method..,");
    }

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
