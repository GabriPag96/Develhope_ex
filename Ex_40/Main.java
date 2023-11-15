package Ex_40;

public class Main {
    public static void main(String[] args){

        boolean result = comparation('c');

        System.out.println(result);
    }
    public static boolean comparation(char b){

        if (Character.isDigit(b)){
            return true;
        }else {
            throw new IllegalArgumentException("Il carattere " + b + " non è un numero");
        }
    }
}
