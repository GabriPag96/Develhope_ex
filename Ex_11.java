public class Ex_11 {
    public static void main(String[] args) {

        char a = 'A';
        char b = 'B';

        System.out.println(a);
        System.out.println(b);

        System.out.println(equalChar(a ,b));
        System.out.println(disequalChar(a ,b));
    }
    public static boolean equalChar(char a,char b){
    return a == b;
    }
    public static boolean disequalChar(char a,char b){
        return a != b;
    }
}
