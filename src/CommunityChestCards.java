import java.util.Map;

public class CommunityChestCards {
    /*
    This class is a placeholder for the CommunityChestCards that will be drawn by players
    */

    private Map<String, String> communityChestCards;

    public CommunityChestCards(Map<String, String> chanceCards) {
        this.communityChestCards = chanceCards;
    }

    public Map<String, String> getCommunityChestCards() {
        return this.communityChestCards;
    }

    public void setCommunityChestCards(Map<String, String> chanceCards) {
        this.communityChestCards = communityChestCards;
    }

    // cards deck, work in progress
    public void cards() {
        communityChestCards.put("Card1", "Advance to Go (Collect $200).");
        communityChestCards.put("Card2", "Bank error in your favor. Collect $200.");
        communityChestCards.put("Card3", "Doctor's fees. Pay $50.");
        communityChestCards.put("Card4", "From sale of stock you get $50.");
        communityChestCards.put("Card5", "Get out of Jail Free. This card may be kept until needed, or traded/sold.");
        communityChestCards.put("Card6", "Go to Jail. Go directly to Jail. Do not pass Go. Do not collect $200.");
    }

}
