package Ex_62;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExerciseTest = OffsetDateTime.parse ("2023-03-01T13:00:00Z");

//        getYear (dateExerciseTest);
//        getMonth (dateExerciseTest);
//        getDay (dateExerciseTest);
//        getDayMonth (dateExerciseTest);

        System.out.println ( getYear (dateExerciseTest));
        System.out.println (getMonth (dateExerciseTest));
        System.out.println (getDay (dateExerciseTest));
        System.out.println (getDayMonth (dateExerciseTest));
    }
    public static String getYear(OffsetDateTime dateExerciseTest){

        String dateYear = String.valueOf (dateExerciseTest.getYear ());
//        System.out.println ("L'anno è = " + dateYear);
        return dateYear;
    }
    public static String getMonth(OffsetDateTime dateExerciseTest){

        String dateMonth = String.valueOf (dateExerciseTest.getMonth ());
//        System.out.println ("Il mese è = " + dateMonth);
        return dateMonth;
    }
    public static String getDay(OffsetDateTime dateExerciseTest){

        String dateDay = String.valueOf (dateExerciseTest.getDayOfWeek ());
//        System.out.println ("Il giorno della settimana è = " + dateDay);
        return dateDay;
    }
    public static String getDayMonth(OffsetDateTime dateExerciseTest){

        String dateDayMonth = String.valueOf (dateExerciseTest.getDayOfMonth ());
//        System.out.println ("Il giorno del mese è = " + dateDayMonth);
        return dateDayMonth;
    }
}
