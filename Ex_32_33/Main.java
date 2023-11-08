package Ex_32_33;

public class Main {
    public static void main(String[] args){

        Rettangolo rettangolo = new Rettangolo(6, 12);
        Triangolo triangolo = new Triangolo(6, 12);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());


    }
}
