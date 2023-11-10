package Ex_38;

public class Main {
    public static void main(String[] args){

        String stringa = "carosello";
        int posizione = 1;
        char carattere = stringa.charAt(posizione);
        int unicode = (int) carattere;

        StringBuilder builder = new StringBuilder();
        builder.append("Il carattere alla posizione ")
                .append(posizione)
                .append(" è: ")
                .append(carattere)
                .append("\nIl suo valore Unicode è: ")
                .append(unicode);

        System.out.println(builder.toString());

    }
}
