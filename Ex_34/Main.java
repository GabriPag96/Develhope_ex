package Ex_34;

public class Main {
    public static void main(String[] args){

        Rettangolo rettangolo = new Rettangolo(10, 20);
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(15, 10);
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}
