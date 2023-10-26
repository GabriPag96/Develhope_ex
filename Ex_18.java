public class Ex_18 {
    public static void main(String [] args){
        int valoreMassimo = 5;
        int sommaValore = 0;
        int valorePartenza = 1;

        while (valorePartenza <= valoreMassimo){
            sommaValore += valorePartenza;
            valorePartenza++;
            System.out.println(sommaValore);
        }
    }
}
