import java.util.ArrayList;
import java.util.List;

public class Gameboard {
    private static class Space {
        String name;
        int position;
        String type;

        public Space(String name, int position, String type) {
            this.name = name;
            this.position = position;
            this.type = type;
        }

        @Override
        public String toString() {
            return position + ": " + name + " (" + type + ")";
        }
    }

    private static class Property extends Space {
        int price;
        int rent;
        String colorGroup;
        String owner;
        int houses;
        boolean hasHotel;

        public Property(String name, int position, int price, int rent, String colorGroup) {
            super(name, position, "Property");
            this.price = price;
            this.rent = rent;
            this.colorGroup = colorGroup;
            this.owner = "None";  // No owner initially
            this.houses = 0;
            this.hasHotel = false;
        }
        public void setOwner(String newOwner) {
            this.owner = newOwner;
        }

        public void addHouse() {
            if (houses < 4 && !hasHotel) {
                houses++;
            } else if (houses == 4) {
                houses = 0;
                hasHotel = true;
            } else {
                System.out.println(name + " already has a hotel!");
            }
        }
        @Override
        public String toString() {
            return super.toString() + " - Price: $" + price + ", Rent: $" + rent + ", Color: " + colorGroup +
                    ", Owner: " + owner + ", Houses: " + houses + ", Hotel: " + (hasHotel ? "Yes" : "No");
        }
    }

    private List<Space> spaces;

    public Gameboard() {
        spaces = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        spaces.add(new Space("Go", 0, "Start"));
        spaces.add(new Property("Mediterranean Avenue", 1, 60, 2, "Brown"));
        spaces.add(new Space("Community Chest", 2, "Community Chest"));
        spaces.add(new Property("Baltic Avenue", 3, 60, 4, "Brown"));
        spaces.add(new Space("Income Tax", 4, "Tax"));
        spaces.add(new Space("Reading Railroad", 5, "Railroad"));
        spaces.add(new Property("Oriental Avenue", 6, 100, 6, "Light Blue"));
        spaces.add(new Space("Chance", 7, "Chance"));
        spaces.add(new Property("Vermont Avenue", 8, 100, 6, "Light Blue"));
        spaces.add(new Property("Connecticut Avenue", 9, 120, 8, "Light Blue"));
        spaces.add(new Space("Jail", 10, "Jail"));
        spaces.add(new Property("St. Charles Place", 11, 140, 10, "Pink"));
        spaces.add(new Space("Electric Company", 12, "Utility"));
        spaces.add(new Property("States Avenue", 13, 140, 10, "Pink"));
        spaces.add(new Property("Virginia Avenue", 14, 160, 12, "Pink"));
        spaces.add(new Space("Pennsylvania Railroad", 15, "Railroad"));
        spaces.add(new Property("St. James Place", 16, 180, 14, "Orange"));
        spaces.add(new Space("Community Chest", 17, "Community Chest"));
        spaces.add(new Property("Tennessee Avenue", 18, 180, 14, "Orange"));
        spaces.add(new Property("New York Avenue", 19, 200, 16, "Orange"));
        spaces.add(new Space("Free Parking", 20, "Free Parking"));
        spaces.add(new Property("Kentucky Avenue", 21, 220, 18, "Red"));
        spaces.add(new Space("Chance", 22, "Chance"));
        spaces.add(new Property("Indiana Avenue", 23, 220, 18, "Red"));
        spaces.add(new Property("Illinois Avenue", 24, 240, 20, "Red"));
        spaces.add(new Space("B. & O. Railroad", 25, "Railroad"));
        spaces.add(new Property("Atlantic Avenue", 26, 260, 22, "Yellow"));
        spaces.add(new Property("Ventnor Avenue", 27, 260, 22, "Yellow"));
        spaces.add(new Space("Water Works", 28, "Utility"));
        spaces.add(new Property("Marvin Gardens", 29, 280, 24, "Yellow"));
        spaces.add(new Space("Go To Jail", 30, "Go To Jail"));
        spaces.add(new Property("Pacific Avenue", 31, 300, 26, "Green"));
        spaces.add(new Property("North Carolina Avenue", 32, 300, 26, "Green"));
        spaces.add(new Space("Community Chest", 33, "Community Chest"));
        spaces.add(new Property("Pennsylvania Avenue", 34, 320, 28, "Green"));
        spaces.add(new Space("Short Line", 35, "Railroad"));
        spaces.add(new Space("Chance", 36, "Chance"));
        spaces.add(new Property("Park Place", 37, 350, 35, "Dark Blue"));
        spaces.add(new Space("Luxury Tax", 38, "Tax"));
        spaces.add(new Property("Boardwalk", 39, 400, 50, "Dark Blue"));
    }

    public void printBoard() {
        for (Space space : spaces) {
            System.out.println(space);
        }
    }

    public void buyProperty(int position, String playerName) {
        if (spaces.get(position) instanceof Property) {
            Property prop = (Property) spaces.get(position);
            if (prop.owner.equals("None")) {
                prop.setOwner(playerName);
                System.out.println(playerName + " bought " + prop.name);
            } else {
                System.out.println(prop.name + " is already owned by " + prop.owner);
            }
        } else {
            System.out.println("This space is not a property.");
        }
    }

    public void upgradeProperty(int position) {
        if (spaces.get(position) instanceof Property) {
            Property prop = (Property) spaces.get(position);
            prop.addHouse();
            System.out.println("Upgraded " + prop.name + " to " + prop.houses + " houses, Hotel: " + (prop.hasHotel ? "Yes" : "No"));
        } else {
            System.out.println("This space is not a property.");
        }
    }

    public static void main(String[] args) {
        Gameboard board = new Gameboard();
        board.printBoard();

        // Simulating purchases and upgrades
        board.buyProperty(1, "Alice");
        board.buyProperty(3, "Bob");
        board.upgradeProperty(1);
        board.upgradeProperty(1);
        board.upgradeProperty(1);
        board.upgradeProperty(1);
        board.upgradeProperty(1); // Should convert to a hotel

        board.printBoard(); // Check updated board state
    }
}

