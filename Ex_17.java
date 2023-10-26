public class Ex_17 {
    public static void main(String[] args ){

        char operatorAlg = '+';

        operatorClass(operatorAlg);
    }
    public static void operatorClass(char operatorAlg){
        switch (operatorAlg){
            case '+':
                System.out.println("Addition operator.");
                break;
            case '-':
                System.out.println("Subtraction operator.");
                break;
            case '/':
                System.out.println("Division operator.");
                break;
            case '*':
                System.out.println("Moltiplication operator.");
                break;
            default:
                System.out.println("Error.");
        }
    }
}
