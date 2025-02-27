import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {
    @Test
    public void testRollWithinRange(){
        Die die = new Die(6);
        for (int i = 0; i < 1000; i++) {
            int result = die.roll();
            assertTrue(result >= 1, "Result should be >= 1");
            assertTrue(result <= 6, "Result should be <= 6");
        }
    }

    @Test
    public void testGetDieValue(){
        Die die = new Die(6);
        die.roll();
        int result = die.getDieValue();
        assertTrue(result >= 1, "Result should be >= 1");
        assertTrue(result <= 6, "Result should be <= 6");
    }
}
