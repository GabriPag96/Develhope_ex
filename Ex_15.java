public class Ex_15 {
    public static void main(String[] args) {

        String parola = "Coccobellooooo";

        if (parola.length() < 10){
            parolaMinoreDi10();
        } else if (parola.length() == 10) {
            parolaUgualeA10();
        } else if (parola.length() > 10) {
            parolaMaggioreDi10();
        }

    }

    public static void parolaMinoreDi10(){
        System.out.println("Lunghezza minore di 10");
    }
    public static void parolaUgualeA10(){
        System.out.println("Lunghezza pari a 10");
    }
    public static void parolaMaggioreDi10(){
        System.out.println("Lunghezza maggiore di 10");
    }
}
