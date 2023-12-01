package Ex_63;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    String input = "2023-03-01T13:00:00Z";

    OffsetDateTime odt = OffsetDateTime.parse (input);
    @Test
    void addAYear(){

        String result = testing.addAYear (odt);
        assertEquals("2024-03-01T13:00Z",result);
    }

    @Test
    void minusAMonth(){

        String result = testing.minusAMonth(odt);
        assertEquals("2023-02-01T13:00Z",result);
    }

    @Test
    void plusSevenDays(){

        String  result = testing.plusSevenDays(odt);
        assertEquals ("2023-03-08T13:00Z",result);
    }

    @Test
    void italianZone(){

        String result = testing.italianZone (odt);
        assertEquals ("2023-03-01T13:00+01:00",result);
    }
}