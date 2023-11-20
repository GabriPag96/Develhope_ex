package Ex_46;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

       HashSet<String> cars = creazioneHashSet();

        for (String element : cars){

            if (Objects.equals(element, "Lotus")){
                System.out.println("L'elemento appartiene alla lista ed è " + element);
            }else {
                System.out.println("L'elemento non appartiene alla lista.");
                break;
            }
        }
    }
    public static HashSet<String> creazioneHashSet(){

        HashSet<String> cars = new HashSet<>();
        cars.add("Fiat");
        cars.add("Audi");
        cars.add("Ferrari");

        return cars;
    }
}
