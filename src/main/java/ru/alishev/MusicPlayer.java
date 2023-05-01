package ru.alishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> musics;
    private Music music;

    private GenreMusic genreMusic;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Value("${music.player.name}")
    private String name;
    @Value("${music.player.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playSingleMusic() {
        System.out.println("Plaing : " + music.getSong());
    }

    public void playMusic() {
        var random = new Random();
        var sizeListMusic = musics.size();
        var randomGenre = random.nextInt(sizeListMusic);
        var sizeListSong = musics.get(sizeListMusic - 1).getSongs().size();
        var randomSong = random.nextInt(sizeListSong);
        System.out.println("Plaing : " + musics.get(randomGenre).getSongs().get(randomSong) +
                " with volume " + this.getVolume());
    }
}

//    public void playMusic(GenreMusic genreMusic) {
//        if (GenreMusic.CLASSICAL == genreMusic) {
//            System.out.println("Plaing : " + classicalMusic.getSong());
//        }
//        else if (GenreMusic.ROCK == genreMusic) {
//            System.out.println("Plaing : " + rockMusic.getSong());
//        }
//    }

//    public void playMusic(GenreMusic genreMusic) {
//        var random = new Random();
//        if (GenreMusic.CLASSICAL == genreMusic) {
//            var size = classicalMusic.getSongs().size();
//            System.out.println("Plaing : " + classicalMusic.getSongs().get(random.nextInt(size)));
//        } else if (GenreMusic.ROCK == genreMusic) {
//            var size = rockMusic.getSongs().size();
//            System.out.println("Plaing : " + rockMusic.getSongs().get(random.nextInt(size)));
//        }
//    }



