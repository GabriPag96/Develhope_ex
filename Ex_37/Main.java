package Ex_37;

public class Main {
    public static void main(String[] args){

        String stringa1 = "Ciao";
        String stringa2 =  "Ciao";
        System.out.println(confrontoStringhe(stringa1, stringa2));
    }
    public static String confrontoStringhe(String stringa1, String stringa2){

        StringBuilder confronto = new StringBuilder("le stringhe ");

        if (stringa1.compareTo(stringa2) == 0 ){
            confronto.append("sono uguali.");
        } else {
            confronto.append("sono diverse.");
        }

        return confronto.toString();
    }
}
