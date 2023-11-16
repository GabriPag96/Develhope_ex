package Ex_44;

public class Main {
    public static void main(String[] args){
        // 2 int + somma.
        int numPrim1 = 5;
        int numPrim2 = 15;
        System.out.println("La somma di " + numPrim1 + " e " + numPrim2  + " è " + sum(numPrim1,numPrim2));

        // 1 char + stampa.
        char charPrim = 'a';
        printChar(charPrim);

        // 2 Integer + somma.
        Integer objInt1 = 10;
        Integer objInt2 = 100;
        System.out.println("La somma degli oggetti di tipo int è " + sum(objInt1,objInt2));

        // 1 Character + stampa.
        Character objChar = 'b';
        printChar(objChar);

        //autoboxing di primitivi
        int i = 4;
        double j = i;
        char k = (char) i;
        Integer autoboxInt = i;
        Double autoboxDouble = j;
        Character autoboxChar = k;   //printa un simbolo illegibile come sostituzione del
                                     //risultato ma non dà errore per la forzatura del cambio tipo. simbolo ""
        //unboxing di primitivi
        Integer boxedInt = 40;
        Double boxedDoub = 10.20;
        Character boxedChar = 'z';
        int unboxInt = boxedInt;
        double unboxDoub = boxedDoub;
        char unboxChar = boxedChar;

        System.out.println("Valore primitivo per int: " + boxedInt);
        System.out.println("Valore primitivo per double: " + boxedDoub);
        System.out.println("Valore primitivo per char: " + boxedChar);
        System.out.println("Autoboxing per int: " + autoboxInt);
        System.out.println("Autoboxing per double: " + autoboxDouble);
        System.out.println("Autoboxing per char: " + autoboxChar);
        System.out.println("Unboxing per Integer: " + unboxInt);
        System.out.println("Unboxing per Double: " + unboxDoub);
        System.out.println("Unboxing per Character: " + unboxChar);
    }

    public static int sum(int numPrim1, int numPrim2){
        return numPrim1 + numPrim2;
    }

    public static void printChar(char charPrim){
        System.out.println("Il carattere primitivo è " + charPrim);
    }

    public static int sum(Integer objInt1, Integer objInt2){
        return objInt1 + objInt2;
    }

    public static void printCharacter(Character objChar){
        System.out.println("Il l'oggetto del carattere è " + objChar);
    }
}
