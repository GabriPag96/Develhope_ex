package Ex_45;

import java.util.HashSet;


public class Main {
    public static void main(String[] args){

        HashSet<String> hashSet = creazioneHashSet();

        System.out.println("La lunghezza dell'Hashset è: " + hashSet.size());
        System.out.println("Gli elementi sono " + hashSet);

    }
    public static HashSet<String> creazioneHashSet(){

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("primo elemento");
        hashSet.add("secondo elemento");
        hashSet.add("terzo elemento");

        return hashSet;
    }
}
