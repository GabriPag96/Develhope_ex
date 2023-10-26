public class Ex_10_11 {
    public static void main(String [] args) {

        int num1 = 5;
        int num2 = 3;

        System.out.println(confronto1(num1, num2));

        System.out.println(confronto2(num1, num2));

        System.out.println(confronto3(num1, num2));

        System.out.println(confronto4(num1, num2));
    }
    public static boolean confronto1(int num1, int num2){
        return num1 != num2;
    }
    public static boolean confronto2(int num1, int num2){
        return num1 > num2;
    }
    public static boolean confronto3(int num1, int num2){
        return num1 < num2;
    }

    public static boolean confronto4(int num1, int num2){
        return num1 == num2;
    }
}


