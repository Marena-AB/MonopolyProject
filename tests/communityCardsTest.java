import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class communityCardsTest {
    CommunityChestCards communityCard = new CommunityChestCards();

    // Test if the community card is created correctly
    @Test
    void testCommunityCardCreation() {
        assertNotNull(communityCard);
    }

    // Test if a community card at a specific index has a correct value
    @Test
    void testCommunityCardValue() {
        communityCard.cards();
        assertEquals("Advance to Go (Collect $200).", communityCard.getCommunityChestCards().get("Card1"));
    }

    // Test the number of community cards
    @Test
    void testNumberOfCommunityCards()
    {
        communityCard.cards();
        assertEquals(16, communityCard.getCommunityChestCards().size());
    }
}
