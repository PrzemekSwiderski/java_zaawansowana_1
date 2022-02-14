package dzien6.streamExamples;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String gameName;
    private List<GameType> gameType = new ArrayList<>();
    private  int releaseYear;
    private ArrayList<String> genre = new ArrayList<>();

    public Game(String gameName, GameType gameType, int releaseYear, String... args ) {
        this.gameName = gameName;
        this.gameType.add(gameType);
        this.releaseYear = releaseYear;
        for(int i =0; i < args.length; i++ ){
            genre.add(args[i]);
        }
    }

    public Game(String gameName, GameType gameType, GameType gameType2, int releaseYear, String... args ) {
        this.gameName = gameName;
        this.gameType.add(gameType);
        this.gameType.add(gameType2);
        this.releaseYear = releaseYear;
        for(int i =0; i < args.length; i++ ){
            genre.add(args[i]);
        }
    }


    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", gameType=" + gameType +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public String getGameName() {
        return gameName;
    }

    public List<GameType> getGameType() {
        return gameType;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
