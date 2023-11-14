package Ex_38_2;

public class UnicodeForm {

    private String inputString;
    private int posizione;

    public UnicodeForm(String inputString, int posizione) {
        this.inputString = inputString;
        this.posizione = posizione;
    }

    public String fromCharToUnicode(){
        StringBuilder builder = new StringBuilder();

        try {
            builder.append("Il carattere alla posizione ")
                    .append(posizione)
                    .append(" è: ")
                    .append(Integer.toHexString(inputString.codePointAt(posizione)));
        } catch (IndexOutOfBoundsException e){
            builder.append("Error. Indice fuori dai limiti.");
        }
        return builder.toString();
    }
}
