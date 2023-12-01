package Ex_61;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTestPattern {

    private final Main testing = new Main();

    @Test
    void dateForm(){
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime odt = OffsetDateTime.parse (input);
        DateTimeFormatter dateFormPatt = DateTimeFormatter.ofPattern ("dd MMMM yyyy");
        String outputPattern = odt.format (dateFormPatt);
        assertEquals("01 marzo 2023", outputPattern);
    }
}