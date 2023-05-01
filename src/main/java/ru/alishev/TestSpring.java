package ru.alishev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.context.alishev.xml");
        //var music = context.getBean("musicBean", Music.class);
        //var musicPlayer = new MusicPlayer(music);

//        var musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.setVolume(80);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        var musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.playMusic();
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//
//        System.out.println(musicPlayer == musicPlayer1);

        //musicPlayer.playMusic();


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        var musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
