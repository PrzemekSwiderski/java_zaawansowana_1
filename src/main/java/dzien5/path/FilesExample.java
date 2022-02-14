package dzien5.path;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("user4.txt");
        Path path2 = Paths.get("user3.txt");

        Path path3 = Path.of(URI.create("file:///fileUri.txt"));

        Files.deleteIfExists(path);
        Files.createFile (path);
        Files.createFile (path3);

        Files.write(path, "test123 ".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "t ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "t3 \n".getBytes(), StandardOpenOption.APPEND);
        for (String line: Files.readAllLines(path)){
            System.out.println(line);
        }
        Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);



    }
}
