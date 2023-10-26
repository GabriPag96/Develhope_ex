public class Ex_19 {
    /*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca la tabellina
     aritmetica di quel numero che dovrà essere stampata a video. */

    public static void main(String [] args){
        int valNum = 6;

        for (int tabellina = 1; tabellina <= 10; tabellina++){
            int risultato = valNum * tabellina;
            System.out.println(valNum + " * " + tabellina + " = " + risultato);
        }
    }

}






