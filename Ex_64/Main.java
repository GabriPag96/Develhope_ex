package Ex_64;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

        BigDecimal operator1 = new BigDecimal ("10.5");
        BigDecimal operator2 = new BigDecimal ("5.5");
        Operation operation = Operation.DIVISION;

        BigDecimal result = calculate(operator1, operator2, operation);

        System.out.println("Operation: " + operation);
        System.out.println("First value: " + operator1);
        System.out.println("Second value: " + operator2);
        System.out.println("Result: " + result);

    }

    public static BigDecimal calculate (BigDecimal operatore1, BigDecimal operatore2,Operation operation){

        return switch (operation) { //fatta da intellij.

            case ADDITION -> operatore1.add (operatore2);
            case SUBTRACTION -> operatore1.subtract (operatore2);
            case MULTIPLICATION -> operatore1.multiply (operatore2);
            case DIVISION -> operatore1.divide (operatore2, 2, RoundingMode.HALF_UP);
            case MIN -> operatore1.min (operatore2);
            case MAX -> operatore1.max (operatore2);

        };
    }
}

