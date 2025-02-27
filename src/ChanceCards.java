import java.util.Map;

public class ChanceCards {

    /*
    This class is a placeholder for the Chance Cards that will be drawn by players
    */

    private Map<String, String> chanceCards;

    public ChanceCards(Map<String, String> chanceCards) {
        this.chanceCards = chanceCards;
    }

    public Map<String, String> getChanceCards() {
        return this.chanceCards;
    }

    public void setChanceCards(Map<String, String> chanceCards) {
        this.chanceCards = chanceCards;
    }

    public void cards()
    {
        chanceCards.put("Card1", "Advance to Boardwalk.");
        chanceCards.put("Card2", "Advance to Go (Collect $200).");
        chanceCards.put("Card3", "Advance to Illinois Ave. If you pass Go, collect $200.");
        chanceCards.put("Card4", "Advance to St. Charles Place. If you pass Go, collect $200.");
        chanceCards.put("Card5", "Advance to the nearest Railroad and pay the owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
        chanceCards.put("Card6", "Advance to the nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
        chanceCards.put("Card12", "Pay poor tax of $15.");
        chanceCards.put("Card13", "Take a trip to Reading Railroad. If you pass Go, collect $200.");
        chanceCards.put("Card14", "Take a walk on the Boardwalk. Advance token to Boardwalk.");
        chanceCards.put("Card15", "You have been elected Chairman of the Board. Pay each player $50.");
        chanceCards.put("Card16", "Your building and loan matures. Collect $150.");

    }

}


