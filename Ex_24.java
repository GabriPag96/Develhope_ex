public class Ex_24 {
    public static void main(String[] args){
        char[] array = creaArray();
        contaUguali(array);
    }
    public static char[] creaArray() {
        char[] array = {'a','b','c','a','d','e','a','f','g','h'};
        return array;
    }
    public static void contaUguali(char[] array){
        int conta = 0;
        for (char carattere : array){
            if (carattere == 'a'){
                conta++;
            }
        }
        System.out.println("Le occorrenze di 'a' sono uguali a = " + conta);
    }
}
