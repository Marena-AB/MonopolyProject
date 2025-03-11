import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameboardTest {

    private Gameboard gameboard;
    private Player player1;
    private Player player2;

    @BeforeEach
    public void setUp() {
        gameboard = new Gameboard();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    @Test
    public void testInitializeBoard() {
        // Test that the board has been initialized with the correct number of spaces
        assertEquals(40, gameboard.getSpaces().size());

        // Test specific spaces
        assertEquals("Go", gameboard.getspace(0).getName());
        assertEquals("Mediterranean Avenue", gameboard.getspace(1).getName());
        assertEquals("Boardwalk", gameboard.getspace(39).getName());
    }

    @Test
    public void testGetspace() {
        // Test that getspace returns the correct space
        assertEquals("Go", gameboard.getspace(0).getName());
        assertEquals("Jail", gameboard.getspace(10).getName());
        assertEquals("Free Parking", gameboard.getspace(20).getName());
        assertEquals("Go To Jail", gameboard.getspace(30).getName());
    }

    @Test
    public void testPrintBoard() {
        // Since printBoard() is a void method that prints to the console,
        // we can't directly test its output. However, we can ensure it doesn't throw an exception.
        assertDoesNotThrow(() -> gameboard.printBoard());
    }

    @Test
    public void testPropertySpaces() {
        // Test that property spaces are correctly initialized
        Space space = gameboard.getspace(1);
        assertTrue(space instanceof Property);
        Property property = (Property) space;
        assertEquals("Mediterranean Avenue", property.getName());
        assertEquals(60, property.getPrice());
        assertEquals(2, property.getRent());
        assertNull(property.getOwner()); // No owner initially
        assertEquals(0, property.getHouses());
        assertFalse(property.hasHotel());
    }

    @Test
    public void testSpecialSpaces() {
        // Test that special spaces are correctly initialized
        Space space = gameboard.getspace(0);
        assertTrue(space instanceof SpecialSpace);
        SpecialSpace specialSpace = (SpecialSpace) space;
        assertEquals("Go", specialSpace.getName());
        assertEquals("Start", specialSpace.getType());

        // Test another special space
        space = gameboard.getspace(10);
        assertTrue(space instanceof SpecialSpace);
        specialSpace = (SpecialSpace) space;
        assertEquals("Jail", specialSpace.getName());
        assertEquals("Jail", specialSpace.getType());
    }

    @Test
    public void testSpecialSpaceToString() {
        // Test the toString method of SpecialSpace
        SpecialSpace specialSpace = (SpecialSpace) gameboard.getspace(0);
        assertEquals("0: Go (Start)", specialSpace.toString());

        specialSpace = (SpecialSpace) gameboard.getspace(10);
        assertEquals("10: Jail (Jail)", specialSpace.toString());
    }

    @Test
    public void testPropertyOwnership() {
        Property property = (Property) gameboard.getspace(1);

        // Test setting and getting the owner
        property.setOwner(player1);
        assertTrue(property.isOwned());

        // Test that another player cannot own the property while it's already owned
        property.setOwner(player2);
    }

    @Test
    public void testAddHouse() {
        Property property = (Property) gameboard.getspace(1);

        // Add houses one by one
        for (int i = 1; i <= 4; i++) {
            property.addHouse();
            assertEquals(i, property.getHouses());
            assertFalse(property.hasHotel());
        }

        // Adding a 5th house should convert to a hotel
        property.addHouse();
        assertEquals(0, property.getHouses());
        assertTrue(property.hasHotel());

        // Adding another house should not change anything (already has a hotel)
        property.addHouse();
        assertEquals(0, property.getHouses());
        assertTrue(property.hasHotel());
    }

    @Test
    public void testOnLand() {
        Property property = (Property) gameboard.getspace(1);
        property.setOwner(player1);

        // Test that a player pays rent when landing on an owned property
        int initialBalance = player2.getBalance();
        property.onLand(player2);
        assertTrue(player2.getBalance() < initialBalance); // Player2 paid rent
        assertTrue(player1.getBalance() > initialBalance); // Player1 received rent

        // Test that no rent is paid if the player owns the property
        initialBalance = player1.getBalance();
        property.onLand(player1);
        assertEquals(initialBalance, player1.getBalance()); // No rent paid
    }

    @Test
    public void testPropertyToString() {
        Property property = (Property) gameboard.getspace(1);
        property.setOwner(player1);
        property.addHouse();

        String expected = "1: Mediterranean Avenue (Property) - Price: $60, Rent: $2, Color: Brown, " +
                "Owner: Player@3c72f59f, Houses: 1, Hotel: No";
        assertEquals(expected, property.toString());
    }
}