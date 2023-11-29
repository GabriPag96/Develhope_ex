package Ex_56;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataYear = String.valueOf(dateExercise.getYear());
        System.out.println("Anno = " + dataYear);

        String dataMonth = String.valueOf(dateExercise.getMonth());
        System.out.println("Mese = " + dataMonth);

        String dataDay = String.valueOf(dateExercise.getDayOfMonth());
        System.out.println("Giorno del mese = " + dataDay);

        String dataDayWeek = String.valueOf(dateExercise.getDayOfWeek());
        System.out.println("Giorno della settimana = " + dataDayWeek);
    }
}
