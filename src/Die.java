/* Purpose: The die class represents a 6 Sided Die. Returns a random number between 1 and 6 inclusive.
* Author: Tati Curtis
* */
import java.util.Random;

// Represents a standard 6 sided die
public class Die {
    private int numberOfSides;
    private Random random;
    private int lastRollValue;

    // Constructs a 6 sided die with a random number generator
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }
    // Rolls the die and stores the result
    public int roll(){
        lastRollValue = random.nextInt(numberOfSides) + 1;
        return lastRollValue;
    }
    // Returns the value of the last roll
    public int getDieValue() {
        return lastRollValue;
    }
}
