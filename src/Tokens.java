import java.util.ArrayList;

public class Tokens {

    public static final String[] TOKENS = {
            "Battleship", "Boot", "Cat", "Duck", "Hat", "Penguin",
            "RaceCar", "Scottie Dog", "T-Rex", "Top Hat", "Tractor", "Wheelbarrow"
    };

    private static ArrayList<String> availableTokens = new ArrayList<>();
    private String owner;
    private int boardPosition;

    // Initialize the available tokens
    public static void initializeTokens() {
        for (String token : TOKENS) {
            availableTokens.add(token);
        }
    }

    // Constructor for setting owner and board position
    public Tokens() {
        this.owner = owner;
        this.boardPosition = boardPosition;
    }

    // Assign a random token to a player
    public static String assignToken() {
        if (availableTokens.size() == 0) {
            return "No tokens available"; // Could throw an exception instead
        }
        int randomIndex = (int) (Math.random() * availableTokens.size());
        String token = availableTokens.get(randomIndex);
        availableTokens.remove(randomIndex); // Remove the token once assigned
        return token;
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }

    // Getter for board position
    public int getBoardPosition() {
        return boardPosition;
    }

    // Setter for owner
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Setter for board position
    public void setBoardPosition(int boardPosition) {
        this.boardPosition = boardPosition;
    }

    // String representation of the token with owner and board position
    @Override
    public String toString() {
        return owner + " - " + boardPosition;
    }
}

