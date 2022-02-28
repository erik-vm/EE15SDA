package advanced.collectionexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> pokemonNames = new LinkedList<String>();
        pokemonNames.offer("Pikachu");
        pokemonNames.add("Charamnder");
        System.out.println(pokemonNames.offer("Covid")); //printout show was the addition successful

        System.out.println(pokemonNames);

        System.out.println(pokemonNames.peek()); //FIFO
    }
}
