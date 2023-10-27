//PREMESSA: per questo esercizio mi sono fatto aiutare da internet con pezzi sparsi dai siti.
//se no mi faceva usare:
// import java.util.Arrays;
//import java.util.stream.IntStream;
public class Ex_25 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5, 4};  //creo l'array con i duplicati.
        int end = array.length; //creo una variabile utilizzabile con array.length

        for (int i = 0; i < end; i++) {            //utilizzo i for innestati per passare in rassegna gli elementi
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {        //if di riconoscimento dei valori uguali
                    int shiftLeft = j;
                    for(int k = j+1; k < end; k++, shiftLeft++) { //un altro for per mettere i
                        array[shiftLeft] = array[k];              // valori uguali in un altro array
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];  //creo un array pulito dove mettere tutti gli elementi senza doppioni
        for(int i = 0; i < end; i++){
            whitelist[i] = array[i];
        }

        for (int i = 0; i < whitelist.length; i++) {
            System.out.println(whitelist[i]);  //stampo l'array con tutti gli elementi puliti.
        }
    }
}
