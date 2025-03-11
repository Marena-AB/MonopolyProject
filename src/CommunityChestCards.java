import java.util.*;

/*
    * This class represents the Community Chest Cards for the Monopoly game.
    * It implements the ChestAndCardSpot interface.
    * The class has a map of the cards and a randomizer to shuffle the cards.
 */



public class CommunityChestCards implements ChestAndCardSpot {


    private Map<String, String> communityChestCards;

    public CommunityChestCards() {
        this.communityChestCards = new HashMap<>();
    }

    public Map<String, String> getCommunityChestCards() {
        return this.communityChestCards;
    }

    public void setCommunityChestCards(Map<String, String> communityChestCards) {
        this.communityChestCards = communityChestCards;
    }


    public void cards() {
        communityChestCards.put("Card1", "Advance to Go (Collect $200).");
        communityChestCards.put("Card2", "Bank error in your favor. Collect $200.");
        communityChestCards.put("Card3", "Doctor's fees. Pay $50.");
        communityChestCards.put("Card4", "From sale of stock you get $50.");
        communityChestCards.put("Card5", "Get out of Jail Free.");
        communityChestCards.put("Card6", "Go to Jail. Go directly to Jail. Do not pass Go. Do not collect $200.");
        communityChestCards.put("Card7", "Holiday Fund matures. Receive $100.");
        communityChestCards.put("Card8", "Income tax refund. Collect $20.");
        communityChestCards.put("Card9", "It is your birthday. Collect $10 from each player.");
        communityChestCards.put("Card10", "Life insurance matures. Collect $100.");
        communityChestCards.put("Card11", "Pay hospital fees of $100.");
        communityChestCards.put("Card12", "Pay school fees of $50.");
        communityChestCards.put("Card13", "Receive $25 consultancy fee.");
        communityChestCards.put("Card14", "You are assessed for street repairs. $40 per house. $115 per hotel.");
        communityChestCards.put("Card15", "You have won second prize in a beauty contest. Collect $10.");
        communityChestCards.put("Card16", "You inherit $100.");
    }

    public String shuffleCards() {
        Random rand = new Random();
        List<String> cards = new ArrayList<>(communityChestCards.keySet());
        String randomCard = cards.get(rand.nextInt(cards.size()));

        return communityChestCards.get(randomCard);
    }
}
