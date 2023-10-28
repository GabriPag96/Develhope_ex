public class Ex_26 {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int somma = sommaMatrice(matrix);
        int somma2 = sommaMatrice2(matrix);

        System.out.println("Somma elementi prima matrice = "+ somma);
        System.out.println("Somma elementi seconda matrice = "+ somma2);
    }
    public static int sommaMatrice(int[][] matrix){
        int somma = 0;

        for (int i = 0; i < matrix[0].length; i++){
            somma += matrix[0][i];
        }
        return somma;
    }
    public static int sommaMatrice2(int[][] matrix){
        int somma2 = 0;
        for (int i = 0; i < matrix[1].length; i++){
            somma2 += matrix[1][i];
        }
        return somma2;
    }
}
