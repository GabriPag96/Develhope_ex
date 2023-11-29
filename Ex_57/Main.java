package Ex_57;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args){

        OffsetDateTime dateExercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime plusOneYear =  dateExercise.plusYears(1);
        System.out.println("Un  anno nel  futuro = " + plusOneYear);

        OffsetDateTime minusOneMonth = plusOneYear.minusMonths(1);
        System.out.println("Meno un mese = " + minusOneMonth);

        OffsetDateTime plusSevenDays = minusOneMonth.plusDays(7);
        System.out.println("Più 7 giorni = " + plusSevenDays);

        ZonedDateTime italianZone = plusSevenDays.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("Geolocalizzata in Italia = " + italianZone);

    }
}
