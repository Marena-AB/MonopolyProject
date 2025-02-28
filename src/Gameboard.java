import java.util.ArrayList;
import java.util.List;

public class Gameboard {

    private List<Space> spaces;

    public Gameboard() {
        spaces = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        spaces.add(new SpecialSpace("Go", 0, "Start"));
        spaces.add(new Property("Mediterranean Avenue", 1, 60, 2, "Brown"));
        spaces.add(new SpecialSpace("Community Chest", 2, "Community Chest"));
        spaces.add(new Property("Baltic Avenue", 3, 60, 4, "Brown"));
        spaces.add(new SpecialSpace("Income Tax", 4, "Tax"));
        spaces.add(new SpecialSpace("Reading Railroad", 5, "Railroad"));
        spaces.add(new Property("Oriental Avenue", 6, 100, 6, "Light Blue"));
        spaces.add(new SpecialSpace("Chance", 7, "Chance"));
        spaces.add(new Property("Vermont Avenue", 8, 100, 6, "Light Blue"));
        spaces.add(new Property("Connecticut Avenue", 9, 120, 8, "Light Blue"));
        spaces.add(new SpecialSpace("Jail", 10, "Jail"));
        spaces.add(new Property("St. Charles Place", 11, 140, 10, "Pink"));
        spaces.add(new SpecialSpace("Electric Company", 12, "Utility"));
        spaces.add(new Property("States Avenue", 13, 140, 10, "Pink"));
        spaces.add(new Property("Virginia Avenue", 14, 160, 12, "Pink"));
        spaces.add(new SpecialSpace("Pennsylvania Railroad", 15, "Railroad"));
        spaces.add(new Property("St. James Place", 16, 180, 14, "Orange"));
        spaces.add(new SpecialSpace("Community Chest", 17, "Community Chest"));
        spaces.add(new Property("Tennessee Avenue", 18, 180, 14, "Orange"));
        spaces.add(new Property("New York Avenue", 19, 200, 16, "Orange"));
        spaces.add(new SpecialSpace("Free Parking", 20, "Free Parking"));
        spaces.add(new Property("Kentucky Avenue", 21, 220, 18, "Red"));
        spaces.add(new SpecialSpace("Chance", 22, "Chance"));
        spaces.add(new Property("Indiana Avenue", 23, 220, 18, "Red"));
        spaces.add(new Property("Illinois Avenue", 24, 240, 20, "Red"));
        spaces.add(new SpecialSpace("B. & O. Railroad", 25, "Railroad"));
        spaces.add(new Property("Atlantic Avenue", 26, 260, 22, "Yellow"));
        spaces.add(new Property("Ventnor Avenue", 27, 260, 22, "Yellow"));
        spaces.add(new SpecialSpace("Water Works", 28, "Utility"));
        spaces.add(new Property("Marvin Gardens", 29, 280, 24, "Yellow"));
        spaces.add(new SpecialSpace("Go To Jail", 30, "Go To Jail"));
        spaces.add(new Property("Pacific Avenue", 31, 300, 26, "Green"));
        spaces.add(new Property("North Carolina Avenue", 32, 300, 26, "Green"));
        spaces.add(new SpecialSpace("Community Chest", 33, "Community Chest"));
        spaces.add(new Property("Pennsylvania Avenue", 34, 320, 28, "Green"));
        spaces.add(new SpecialSpace("Short Line", 35, "Railroad"));
        spaces.add(new SpecialSpace("Chance", 36, "Chance"));
        spaces.add(new Property("Park Place", 37, 350, 35, "Dark Blue"));
        spaces.add(new SpecialSpace("Luxury Tax", 38, "Tax"));
        spaces.add(new Property("Boardwalk", 39, 400, 50, "Dark Blue"));
    }

    public Space getSpace(int position) {
        return spaces.get(position);
    }

    public void printBoard() {
        for (Space space : spaces) {
            System.out.println(space);
        }
    }

    public static void main(String[] args) {
        Gameboard board = new Gameboard();
        board.printBoard();
    }
}

