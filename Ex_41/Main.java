package Ex_41;

public class Main {
    public static void main(String[] args){

        divideByZero();
    }
    public static void divideByZero() {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e);  //Può essere utilizzato .getMessage() per una trascrizione diretta dell'errore.
        }
    }
}
