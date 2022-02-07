package ru.spring.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import ru.alishev.springcourse.TestBean;

public class TestSpring {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml" // обращаемся к конфигурационному файлу
        );

       // Music music = context.getBean("musicBean", Music.class); // получаем объект из бинаб не созд вручную
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // Dependency Injection (DI), внедрение зависимости с помощью Spring чз Bean
        musicPlayer.playMusic();;

        context.close();
    }
}
