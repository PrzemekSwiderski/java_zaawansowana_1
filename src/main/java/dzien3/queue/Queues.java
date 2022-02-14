package dzien3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        pokemons.offer("Bulbazaur");

        System.out.println(pokemons);
        System.out.println(pokemons.poll());
        System.out.println(pokemons.remove());
        System.out.println(pokemons);
        System.out.println(pokemons.peek());


    }
}
