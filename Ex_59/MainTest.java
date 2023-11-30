package Ex_59;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    private final Main testing = new Main();
    @Test
    void sum(){
        Integer result = testing.sum(3,5);
        assertEquals(8,result,"Il risultato dovrebbe essere 8");
    }
    @Test
    void negativeSum(){
        Integer result = testing.sum(-3,5);
        assertEquals(2,result,"Il risultato dovrebbe essere 2");
    }
    @Test
    void nullSum(){
        Integer result = testing.sum(null,5);
        assertNull(result,"Uno dei parametri è null");
    }
}