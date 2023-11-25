package Ex_51;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cities = Map.of("PA", "Palermo","ME", "Messina","CT","Catania");

        System.out.println(cities);

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Marco",22);
        people.put("Paolo",32);
        people.put("Carla",26);

        System.out.println(people);

        Map<String, Integer> numbers = Map.ofEntries(

                Map.entry("Uno", 1),
                Map.entry("Due", 2),
                Map.entry("Tre", 3)
        );

        System.out.println(numbers);

    }
}
