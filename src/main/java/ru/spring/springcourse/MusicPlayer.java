package ru.spring.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
   // private Music music;

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) { // для списка муз жанров
        this.musicList = musicList;
    }

    private String name;

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //IoC
   /* public MusicPlayer(Music music) {
        this.music=music;
    } */

    public MusicPlayer() {} // конструктор для внедрения чз setter

    /* public void setMusic(Music music) {
        this.music=music;    } // сеттер для music */

    //public void playMusic(){ System.out.println("Playing: "+ music.getSong());
    // }

    public void playMusic() { for (int i=0; i < musicList.size();i++) { // прохождение по всем муз жанрам в списке
        System.out.println("Playing: "+ musicList.get(i).getSong());
    }
        //musicList.forEach(System.out::println);

    }
}
