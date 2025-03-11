import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChanceCardsTest {
    ChanceCards chanceCard = new ChanceCards();

    // Test if the chance card is created correctly
    @Test
    void testChanceCardCreation() {
        assertNotNull(chanceCard);
    }

    // Test if a chance card at a specific index has a correct value
    @Test
    void testChanceCardValue() {
        chanceCard.cards();
        assertEquals("Take a ride on the Reading Railroad. If you pass Go, collect $200.", chanceCard.getChanceCards().get("Card1"));
    }

    // Test the number of chance cards
    @Test
    void testNumberOfChanceCards()
    {
        chanceCard.cards();
        assertEquals(16, chanceCard.getChanceCards().size());
    }

}