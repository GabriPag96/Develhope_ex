public class Ex_20 {
    /* Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che
       vuoi avere e stampi tutti i numeri naturali in ordine inverso (Quindi se passo il punto di partenza a 6 e gli
       dico direstituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).*/

    public static void main(String [] args){
        int numero = 6;
        int risultati = 3;

        for (int i = numero;i > numero - risultati; i--){
            System.out.println(i);
        }
    }
}
