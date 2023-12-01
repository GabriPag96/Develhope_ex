package Ex_61;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main61Test {

    private Main61 testing = new Main61 ();
    OffsetDateTime dateExerciseTest = OffsetDateTime.parse ("2023-03-01T13:00:00Z");

    @Test
    void dateForm(){

        String result = testing.dateForm (dateExerciseTest);
        assertEquals("01 03 2023",result);
    }
}