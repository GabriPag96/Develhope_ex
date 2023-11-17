package Ex_46;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        HashSet<String> cars = new HashSet<>();
        cars.add("Fiat");
        cars.add("Audi");
        cars.add("Ferrari");

        for (String element : cars){

            if (Objects.equals(element, "Ferrari")){
                System.out.println("L'elemento appartiene alla lista ed è " + element);
            }
        }
    }
}
