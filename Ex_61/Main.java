package Ex_61;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExerciseTest = OffsetDateTime.parse ("2023-03-01T13:00:00Z");

        dateForm (dateExerciseTest);
    }
    public static void dateForm(OffsetDateTime dateExerciseTest){

        String datePat = dateExerciseTest.format (DateTimeFormatter.ofPattern ("dd MMMM yyyy"));
        System.out.println ("Data per pattern = " + datePat);
    }
}
