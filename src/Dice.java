public class Dice {
    private Die die1;
    private Die die2;
    private int consecutiveDoubles;

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

    public int getTotal(){
        return die1.getDieValue() + die2.getDieValue();
    }

    public int getConsecutiveDoubles() {
        return consecutiveDoubles;
    }

    public boolean shouldGoToJail(){
        return consecutiveDoubles >= 3;
    }

    public void resetConsecutiveDoubles() {
        consecutiveDoubles = 0;
    }
}
