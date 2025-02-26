public class CommunityChestSpot {

    private String name;
    private int position;
    private String type;

    public CommunityChestSpot(String name, int position) {
        this.name = name;
        this.position = position;
        this.type = "Community Chest";
    }

    public void userLandsOnCommunityChestSpot() {
        // Logic for pulling a card from the Community Chest deck
        // This could involve randomizing a card from a predefined list of cards
        // which can result in either receiving money, paying money to the bank,
        // or being instructed to move to a different space on the board

    }

    @Override
    public String toString() {
        return position + ": " + name + " (" + type + ")";
    }




}
