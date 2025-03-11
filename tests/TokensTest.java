import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TokensTest {
    Tokens tokens = new Tokens();

        // Test if the tokens are created correctly
        @Test
        void testTokensCreation() {
            assertNotNull(tokens);
        }

        // Test if a token is assigned correctly
        @Test
        void testTokenAssignment() {
            Tokens.initializeTokens();
            String token = Tokens.assignToken();
            assertNotNull(token);
        }

        // Test if the owner is set correctly
        @Test
        void testOwner() {
            tokens.setOwner("Player1");
            assertEquals("Player1", tokens.getOwner());
        }

        // Test if the board position is set correctly
        @Test
        void testBoardPosition() {
            tokens.setBoardPosition(5);
            assertEquals(5, tokens.getBoardPosition());
        }

        // Test if the string representation of the token is correct
        @Test
        void testToString() {
            tokens.setOwner("Player1");
            tokens.setBoardPosition(5);
            assertEquals("Player1 - 5", tokens.toString());
        }





}