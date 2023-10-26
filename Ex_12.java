public class Ex_12 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        System.out.println(confronto(x, y));
    }
    /*public static boolean confronto(int x, int y){
        int valConfronto = 15;
        return x < valConfronto && y > valConfronto;
    }*/
    public static String confronto(int x, int y){
        int valConfronto = 15;
        /*if (valConfronto > x && valConfronto < y) {
            System.out.println("il valore è tra i due apici");
        }else {
            System.out.println("il valore non è tra i due apici in quanto " +
            valConfronto + " non è all'interno di " + x + " e " + y);
        }*/
        return (valConfronto > x && valConfronto < y) ? "è tra i due apici " + x + " e " + y : "non è tra i due apici" ;
    }
}
