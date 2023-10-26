public class Ex_13 {
    public static void main(String[] args) {

        int num1 = 5;

        verificaPari(num1);
    }
    public static void verificaPari(int num1){
        boolean pari = num1 % 2 == 0;
        System.out.println(pari);
    }
}
