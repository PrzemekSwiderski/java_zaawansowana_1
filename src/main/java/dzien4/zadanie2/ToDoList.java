package dzien4.zadanie2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) throws IOException {
        List<String> toDoList = new ArrayList<>();

        BufferedReader in = new BufferedReader(new FileReader("todo.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("todo_complete.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            toDoList.add(line + "\t\t✓\n");
            out.write(toDoList.get(toDoList.size() - 1));
        }

        out.close();


    }
}
