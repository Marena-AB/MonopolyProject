/* Unit test for the Dice class */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    // Test that rolling the dice returns a value between 2 and 12
    @Test
    public void testRollWithinRange(){
        Dice dice = new Dice();
        for (int i = 0; i < 1000; i++) {
            dice.rollDice();
            int result = dice.getTotal();
            assertTrue(result >= 2, "Result should be >= 2");
            assertTrue(result <= 12, "Result should be <= 12");
        }
    }

    // Tests that rolling doubles increments the consecutiveDoubles counter and resets the counter
    @Test
    public void testRollingDoubles(){
        Die die1 = new Die(6) {
            @Override
            public int roll() {
                return 3;
            }
        };

        Die die2 = new Die(6) {
            @Override
            public int roll() {
                return 3;
            }
        };

        Dice fixedDice = new Dice(die1, die2);

        fixedDice.rollDice();
        assertEquals(1, fixedDice.getConsecutiveDoubles());
        fixedDice.rollDice();
        assertEquals(2, fixedDice.getConsecutiveDoubles());
        fixedDice.rollDice();
        assertEquals(3, fixedDice.getConsecutiveDoubles());
        assertTrue(fixedDice.shouldGoToJail());

        fixedDice.resetConsecutiveDoubles();
        assertEquals(0, fixedDice.getConsecutiveDoubles());
    }
}
