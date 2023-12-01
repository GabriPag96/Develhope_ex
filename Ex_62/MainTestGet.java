package Ex_62;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTestGet {

    private final Main testing = new Main();
    String input = "2023-03-01T13:00:00Z";
    OffsetDateTime odt = OffsetDateTime.parse (input);

    @Test
    void getYear(){

        String result = testing.getYear(odt);
        assertEquals("2023", result);
    }

    @Test
    void getMonth(){
        String result = testing.getMonth (odt);
        assertEquals("MARCH", result);
    }

    @Test
    void getDay(){
        String result = testing.getDay (odt);
        assertEquals("WEDNESDAY", result);
    }

    @Test
    void getDayMonth(){
        String result = testing.getDayMonth (odt);
        assertEquals("1", result);
    }
}