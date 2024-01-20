package ua.hillel.kostiuk.lessons.lesson13.HW15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[]{
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic(),
                new PopMusic()
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
