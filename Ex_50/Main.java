package Ex_50;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Mela"));
        fruits.add(new Fruits("Banana"));
        fruits.add(new Fruits("Arancia"));
        fruits.add(new Fruits("Kiwi"));

        System.out.println("Lista dei frutti:");
        for (Fruits f: fruits) {
            System.out.println(f.getName());
        }
        fruits.addFirst(new Fruits("Limone"));
        fruits.addLast(new Fruits("Ananas"));

        System.out.println("\nLista dei frutti aggiornata:");
        for (Fruits f: fruits) {
            System.out.println(f.getName());
        }
    }
}
