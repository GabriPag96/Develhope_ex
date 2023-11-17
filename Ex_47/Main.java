package Ex_47;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        HashSet<String> pasta = new HashSet<>();
        pasta.add("Spaghetti");
        pasta.add("Rigatoni");
        pasta.add("Tortellini");

        //oggetto dello stesso tipo e popolamento
        String oggetto = "Rigatoni";
        pasta.add(oggetto);

        for (String element : pasta){
            if(Objects.equals(element, oggetto)){
                pasta.remove(element);
                break;
            }
        }

        System.out.println(" Dimensione dell'HashSet prima del clear: " + pasta.size());
        System.out.println("Elementi dell'HashSet prima del clear: " + pasta);

        pasta.clear();

        System.out.println("Dimensione dell'HashSet dopo il clear: " + pasta.size());
        System.out.println("Elementi dell'HashSet dopo il clear: " + pasta);
    }
}
