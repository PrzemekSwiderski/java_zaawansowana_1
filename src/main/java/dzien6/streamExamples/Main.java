package dzien6.streamExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        Game witcher3 = new Game("Witcher 3", GameType.SINGLEPLAYER, 2015, "RPG");
        Game gta = new Game("GTA 5", GameType.SINGLEPLAYER, GameType.MULTIPLAYER, 2013, "FPS", "RPG");
        Game destiny = new Game("Destiny", GameType.SINGLEPLAYER, GameType.MULTIPLAYER, 2014, "FPS");
        Game diablo = new Game("Diablo2", GameType.SINGLEPLAYER, GameType.MULTIPLAYER, 1996, "Slasher", "RPG");
        Game wot = new Game("World of Tanks", GameType.MULTIPLAYER, 2010, "OnlineShooter");
        Game farCry = new Game("Far Cry", GameType.SINGLEPLAYER, 2004, "FPS", "RPG");
        Game warcraft = new Game("warcraft", GameType.SINGLEPLAYER, 1994, "CRPG");
        Game simCity = new Game("SimCity 3000", GameType.SINGLEPLAYER, 1999, "Symulacja");
        Game sims = new Game("Sims", GameType.SINGLEPLAYER, 2000, "Symulacja");
        Game gothic = new Game("Gothic", GameType.SINGLEPLAYER, 2001, "RPG");
//
        games.add(witcher3);
        games.add(gta);
        games.add(destiny);
        games.add(diablo);
        games.add(wot);
        games.add(farCry);
        games.add(warcraft);
        games.add(simCity);
        games.add(sims);
        games.add(gothic);

//        List<Game> listOfFilteredGames = new ArrayList<>();
//
//        for (Game game : games) {
//            if (game.getGameType().equals(GameType.SINGLEPLAYER) && game.getReleaseYear() > 2000) {
//                listOfFilteredGames.add(game);
//            }
//        }
//
//        listOfFilteredGames.sort((o1, o2) -> o1.getGameName().toLowerCase().compareTo(o2.getGameName().toLowerCase()));
//
//        List<String> listOfFilteredGamesNames = new ArrayList<>();
//
//        for (Game name : listOfFilteredGames) {
//            listOfFilteredGamesNames.add(name.getGameName());
//        }
//
//        System.out.println("Na wejściu: " + games);
//        System.out.println("po filtrze: " + listOfFilteredGames);
//        System.out.println("po filtrze: " + listOfFilteredGames.size());
//        System.out.println("po filtrze: " + listOfFilteredGamesNames);

//        List<String> listOfFilteredGamesNames = games.stream()
//                .filter(game -> game.getGameType().equals(GameType.SINGLEPLAYER))
//                .filter(game -> game.getReleaseYear() > 2000)
//                .map(game -> game.getGameName())
//                .sorted((o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()))
//                .collect(Collectors.toList());
//
//        long listOfFilteredGamesSize = games.stream()
//                .filter(game -> game.getGameType().equals(GameType.SINGLEPLAYER))
//                .filter(game -> game.getReleaseYear() > 2000)
//                .map(game -> game.getGameName())
//                .sorted((o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()))
//                .count();
//
//        System.out.println("po filtrze: " + listOfFilteredGamesNames);
//        System.out.println("po filtrze: " + listOfFilteredGamesSize);

//        List<String> listOfRPG = games.stream()
//                .filter(game -> game.getGenre().contains("RPG"))
//                .map(game -> game.getGameName())
//                .sorted((o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()))
//                .collect(Collectors.toList());
//        System.out.println("Po kolejnym filtrze: " + listOfRPG);


        List<String> listOfgames = games.stream()
                .filter(game -> game.getGameName().toLowerCase().startsWith("w"))
                .sorted((o1, o2) -> o1.getReleaseYear() < o2.getReleaseYear() ? 1 : -1)
                .map(game -> game.getGameName())
                .collect(Collectors.toList());

        List<String> listOfgames2 = games.stream()
                .filter(game -> game.getGameName().toLowerCase().startsWith("w"))
                .sorted(new Comparator<Game>() {
                    @Override
                    public int compare(Game o1, Game o2) {
                    if (o1.getReleaseYear() > o2.getReleaseYear()){
                        return -1;
                    } else{
                        return  1;
                    }
                    }
                })
                .map(game -> game.getGameName())
                .collect(Collectors.toList());


        System.out.println(listOfgames);
        System.out.println(listOfgames2);
    }
}
