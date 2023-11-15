package Ex_39;

public class Main {
    public static void main(String[] args){

        boolean result = rangeNum(16,1,10);

        System.out.println(result);
    }
    public static boolean rangeNum(int num, int min, int max){

        if (num > min && num < max){
            return true;
        }else {
            throw new IllegalArgumentException("Il numero " + num + " non si trova tra gli apici: " + min + " e " + max);
        }

    }
}
