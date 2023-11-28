package Ex_55;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dateString = dateExercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Data esercizio = "+ dateString);
    }
}
