package Ex_42;

public class Main {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        divideByZero(arr);
    }
    public static void divideByZero(int[] arr){

        try {
            int num = arr[6] / 0;
        }catch (ArithmeticException e) {
            System.out.println("Errore divisione: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Errore indice: " + e.getMessage());
        }
    }
}
