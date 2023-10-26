public class Ex_09_10 {
    public static void main(String [] args) {

        int num1 = 10;
        int num2 = 26;


        System.out.println(num1);
        System.out.println(num2);

        System.out.println(incremento(num1, num2));
    }
    public static int incremento(int num1, int num2){
        int incremento = 4;
        num1 += incremento;
        num2 += incremento;

        System.out.println(num1);
        System.out.println(num2);
        return num1 * num2;
    }
}
