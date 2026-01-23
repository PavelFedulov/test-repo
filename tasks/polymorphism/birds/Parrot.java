package birds;

import java.util.Random;

public class Parrot extends Bird{
    private final String song;

    public Parrot(String name, String song){
        super(name);
        if (song == null || song.isEmpty())
            throw new IllegalArgumentException("Text must have at least 1 symbol");
        this.song = song;
    }

    @Override
    public void sing(){
        int countSymbols =  new Random().nextInt(song.length()) + 1;
        System.out.println(song.substring(0, countSymbols));
    }
}
