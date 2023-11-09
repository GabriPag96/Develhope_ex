package Ex_35;

public class Main {
    public static void main(String[] args){

        Rettangolo rettangolo = new Rettangolo(8,10);
        System.out.println("L'area del rettangolo è= " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(4,12);
        System.out.println("L'area del triangolo è= " + triangolo.calcolaArea());
    }
}
