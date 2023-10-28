public class Ex_27 {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3},{4, 5, 6}};

        int[][] specchioMatrice = scambioMatrice(matrix); //richiamo quello che ho fatto tornare con la funzione.

        printMatrix(specchioMatrice); //funzione solo per la stampa.
    }
    public static int[][] scambioMatrice(int[][] matrix){
        int firstValue = matrix.length;                            //creo 2 valori riferiti alle matrici da accorpare
        int secondValue = matrix[0].length;                         //nei 2 for per riferirli alla lettura contraria
        int[][] specchioMatrice = new int[secondValue][firstValue];  //della matrice e ne creo una nuova da far leggere.

        for (int i = 0; i < firstValue; i++){
            for (int j = 0; j < secondValue; j++){
                specchioMatrice[j][i] = matrix[i][j]; //specchio i valori.
            }
        }
        return specchioMatrice; //faccio tornare la matrice specchiata.
    }
    public static void printMatrix(int[][] matrix){ //creo un metodo per printare la matrice in modo sfalzato.
        for (int[] fila : matrix){
            for (int element : fila){
                System.out.print(element + " ");
            }
            System.out.println(); //crea lo spazio tra gli elementi e va a capo [0][0] [1][1] [2][2].
        }
    }
}
