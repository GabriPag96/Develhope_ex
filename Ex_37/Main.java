package Ex_37;

public class Main {
    public static void main(String[] args){

        String stringa1 = "Ciao";
        String stringa2 =  "Ciao";
        System.out.println(confrontoStringhe(stringa1, stringa2));
    }
    public static String confrontoStringhe(String stringa1, String stringa2){

        StringBuilder confronto = new StringBuilder();

        if (stringa1.compareTo(stringa2) == 0 ){
            System.out.println("Le stringhe sono uguali");
        } else {
            System.out.println("Le due stringhe sono differenti");
        }

        return confronto.toString();
    }
}
