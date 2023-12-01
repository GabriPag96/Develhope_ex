package Ex_63;

import java.time.OffsetDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args){
        OffsetDateTime dateExerciseTest = OffsetDateTime.parse ("2023-03-01T13:00:00Z");
        System.out.println (addAYear (dateExerciseTest));
        System.out.println (minusAMonth (dateExerciseTest));
        System.out.println (plusSevenDays (dateExerciseTest));
        System.out.println (italianZone (dateExerciseTest));
    }
    public static String addAYear(OffsetDateTime dateExerciseTest){

        OffsetDateTime plusOneYear = dateExerciseTest.plusYears (1);
        return String.valueOf (plusOneYear);
    }
    public static String minusAMonth(OffsetDateTime dateExerciseTest){

        OffsetDateTime minusOneMonth = dateExerciseTest.minusMonths (1);
        return String.valueOf (minusOneMonth);
    }
    public static String plusSevenDays(OffsetDateTime dateExeerciseTest){

        OffsetDateTime plus7Days = dateExeerciseTest.plusDays (7);
        return String.valueOf (plus7Days);
    }
    public static String italianZone(OffsetDateTime dateExeerciseTest){

        OffsetDateTime itaZoned = dateExeerciseTest.atZoneSimilarLocal (ZoneId.of ("Europe/Rome")).toOffsetDateTime ();
        return String.valueOf (itaZoned);
    }

}
