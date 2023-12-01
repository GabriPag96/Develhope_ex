package Ex_60;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    String input = "2002-03-01T13:00:00Z";
    OffsetDateTime odt = OffsetDateTime.parse (input);
    @Test
    void dateForm_Full(){

        String result = testing.dateForm_Full(odt);
//        DateTimeFormatter dateTimeFull = DateTimeFormatter.ofLocalizedDate (FormatStyle.FULL);
//        String outputFull = odt.format (dateTimeFull);
        assertEquals ("venerdì 1 marzo 2002", result);
    }

    @Test
    void dateForm_Medium(){
        String result = testing.dateForm_Medium (odt);
//        DateTimeFormatter dateTimeMedium = DateTimeFormatter.ofLocalizedDateTime (FormatStyle.MEDIUM,FormatStyle.MEDIUM);
//        String outputMedium = odt.format (dateTimeMedium);
        assertEquals("1 mar 2002, 13:00:00", result);
    }

    @Test
    void dateForm_Short(){
        String result = testing.dateForm_Short (odt);
//        DateTimeFormatter dateTimeShort = DateTimeFormatter.ofLocalizedDate (FormatStyle.SHORT);
//        String outputShort = odt.format (dateTimeShort);
        assertEquals("01/03/02", result);
    }
}