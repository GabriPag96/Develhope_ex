package Ex_58;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExercise1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime dateExercise2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("La prima data è precedente alla seconda? " + dateExercise1.isBefore(dateExercise2));

        System.out.println("La seconda data è successiva alla prima? " + dateExercise2.isAfter(dateExercise1));

        System.out.println("Le date sono uguali? " + dateExercise1.isEqual(dateExercise2));
    }
}
