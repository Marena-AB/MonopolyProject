/* Purpose: Represents a pair of dice used for rolling in the game. Tracks doubles and determines if a player rolls
 * three consecutive doubles and should go to jail.
 * Author: Tati Curtis
 * */
public class Dice {
    private Die die1;
    private Die die2;
    private int consecutiveDoubles;

    // Constructs a new Dice object with two six-sided dice.
    public Dice(){
        die1 = new Die(6);
        die2 = new Die(6);
        consecutiveDoubles = 0;
    }

    public Dice(Die die1, Die die2) {
        this.die1 = die1;
        this.die2 = die2;
        consecutiveDoubles = 0;
    }

    // Rolls both dice and updates the consecutiveDoubles count.
    public int rollDice(){
        int roll1 = die1.roll();
        int roll2 = die2.roll();

        if (roll1 == roll2) {
            consecutiveDoubles++;
        } else {
            consecutiveDoubles = 0;
        }
        return roll1 + roll2;
    }

    // Gets the total value of the two dice.
    public int getTotal(){
        return die1.getDieValue() + die2.getDieValue();
    }

    // Gets the number of consecutive doubles rolled.
    public int getConsecutiveDoubles() {
        return consecutiveDoubles;
    }

    // Determines if the player should go to jail for rolling three consecutive doubles.
    public boolean shouldGoToJail(){
        return consecutiveDoubles >= 3;
    }

    // Resets the consecutiveDoubles count to zero.
    public void resetConsecutiveDoubles() {
        consecutiveDoubles = 0;
    }
}
