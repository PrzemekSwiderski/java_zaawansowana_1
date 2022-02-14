package dzien5.zadanie1;

import java.io.IOException;
import java.nio.file.*;

public class Zad1 {
    public static void main(String[] args) throws IOException {

/*        Napiszcie program ktory stowrzy plik w biezacym katalogu zapisze ciag znakow,
        skopiuje plik nastepnie podmieni wyswtapienie jednej wybranej literki na inna
        badz caly ciag nazkow. na koncu sklei dwa pliki oryginalny i skopiowany*/

        Path firstFile = Paths.get("Pierwszy_plik_do_zadania1.txt");
        Path secondFile = Paths.get("Drugi_plik_do_zadania1.txt");
        Path thirdFile = Paths.get("Trzeci_plik_do_zadania1.txt");

        Files.deleteIfExists(firstFile);
        Files.deleteIfExists(thirdFile);

        Files.createFile(firstFile);

        Files.write(firstFile, "Litwo, Ojczyzno moja! ty jesteś jak zdrowie;\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(firstFile, "Ile cię trzeba cenić, ten tylko się dowie,\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(firstFile, "Kto cię stracił. Dziś piękność twą w całej ozdobie\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(firstFile, "Widzę i opisuję, bo tęsknię po tobie.\n".getBytes(), StandardOpenOption.APPEND);

        Files.copy(firstFile, secondFile, StandardCopyOption.REPLACE_EXISTING);

        StringBuilder stringBuilder = new StringBuilder();
        for (String line : Files.readAllLines(secondFile)) {
            stringBuilder.append(line.replace('o', 'O')).append("\n");
        }

        Files.write(secondFile, stringBuilder.toString().getBytes());

        Files.createFile(thirdFile);

        for (String line: Files.readAllLines(firstFile)) {
            Files.write(thirdFile, line.getBytes(), StandardOpenOption.APPEND);
            Files.write(thirdFile, "\n".getBytes(), StandardOpenOption.APPEND);
        }
        Files.write(thirdFile, "\n".getBytes(), StandardOpenOption.APPEND);
        for (String line: Files.readAllLines(secondFile)) {
            Files.write(thirdFile, line.getBytes(), StandardOpenOption.APPEND);
            Files.write(thirdFile, "\n".getBytes(), StandardOpenOption.APPEND);
        }



    }
}
