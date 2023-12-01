package Ex_60;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExerciseTest = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        dateForm_Full (dateExerciseTest);
        dateForm_Medium (dateExerciseTest);
        dateForm_Short (dateExerciseTest);
    }
    public static void dateForm_Full(OffsetDateTime dateExerciseTest){

        String dateFormFull = dateExerciseTest.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dateFormFull);
    }
    public static void dateForm_Medium(OffsetDateTime dateExerciseTest){

        String dateFormMedium = dateExerciseTest.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));
        System.out.println(dateFormMedium);
    }
    public static void dateForm_Short(OffsetDateTime dateExerciseTest){

        String dateFormShort = dateExerciseTest.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dateFormShort);
    }

}
