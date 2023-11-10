package Ex_38;

public class Main {
    public static void main(String[] args){

        String stringa = "carosello";
        int posizione = 3;
        char carattere = stringa.charAt(posizione);
        //int unicode = (int) carattere;

        StringBuilder builder = new StringBuilder();
        builder.append("Il carattere alla posizione ")
                .append(posizione)
                .append(" è: ")
                .append(carattere)
                .append("\nIl suo valore Unicode è: ")
//              .append(unicode)                               //valore in decimale
                .append(Integer.toHexString(carattere));       //valore in unicode con la forzatura in int

        System.out.println(builder.toString());

    }
}
