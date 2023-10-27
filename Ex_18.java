public class Ex_18 {
    //Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso
    // 1 valore intero come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
    // (Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)

    public static void main(String [] args){
        int valoreMassimo = 5;

        int valorePartenza = 1;

        somma(valoreMassimo, valorePartenza); //con metodo void.
        //System.out.println(somma(valoreMassimo, valorePartenza));//stampa 2 volte l'ultimo numero.
    }
    public static void somma(int valoreMassimo, int valorePartenza){
        int sommaValore = 0;

        while (valorePartenza <= valoreMassimo){
            sommaValore += valorePartenza;
            valorePartenza++;
            System.out.println(sommaValore);
        }
        //return sommaValore;
    }
}
