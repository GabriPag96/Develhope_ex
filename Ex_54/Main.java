package Ex_54;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExercise = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateString = dateExercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("one = "+ dateString);

//      String dateString1 = dateExercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString1 = dateExercise.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));
        System.out.println("two = "+ dateString1);

        String dateString2 = dateExercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("three = "+ dateString2);

    }
}
