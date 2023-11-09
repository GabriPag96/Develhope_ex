package Ex_36;




public class Main {
    public static void main(String[] args){

        Rettangolo rettangolo = new Rettangolo(4,10,TipoForma.rettangolo);
//        System.out.println("L'area del rettangolo è= " + rettangolo.calcolaArea()+ " " + rettangolo);
        System.out.println(rettangolo);

        Triangolo triangolo = new Triangolo(6,14,TipoForma.triangolo);
//        System.out.println("L'area del triangolo è= " + triangolo.calcolaArea() + " " + triangolo);
        System.out.println(triangolo);
    }
}
