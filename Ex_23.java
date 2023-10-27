/*Scrivi un programma che contenga un metodo che crea un array e
lo riempie con i numeri da 1 a 10 e che che calcoli la somma
dei numeri contenuti nell'array inizializzato e la stampi a video.*/
public class Ex_23 {
    public static void main(String[] args){
        int[] array = createArray();
        System.out.println("La somma dei numeri contenuti nel array è = " +sommaNumArr(array));
    }
    public static int[] createArray(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }
    public static int sommaNumArr(int[] array){
        int sumArr = 0;
        for (int element : array){
             sumArr += element;
        }
        return sumArr;
    }
}
