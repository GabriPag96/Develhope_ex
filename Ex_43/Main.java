package Ex_43;

public class Main {
    public static void main(String[] args){
        Integer num = 5;
        Integer denom = 10;

        Integer num2 = null;
        Integer denom2 = 10;

        try {
            int result = divide(num,denom);
            System.out.println("Result: " + result);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(divide(num2, denom2));
    }
    public static int divide(Integer num, Integer denom){

        if (num == null || denom == null){
            throw new IllegalArgumentException("Numeratore o denominatore non può essere null.");
        }else {
            return num / denom;
        }
    }
}
