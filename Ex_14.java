public class Ex_14 {
    public static void main(String[] args) {

        //int numero = 1;

        /*while (numero <= 100){

            if(numero % 3 == 0 && numero % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Numero = " + numero);
            }

            numero++;
        }*/
        for (int numero = 1; numero <= 100; numero++) {

            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Numero = " + numero);
            }
        }
    }

}
