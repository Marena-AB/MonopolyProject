public class Main {
  public static void main(String[] args) {
    // Initialize the gameboard
    Gameboard board = new Gameboard();

    // Print the gameboard spaces
    System.out.println(board.getspace(10));
    System.out.println(board.getspace(20));
    System.out.println(board.getspace(30));
    System.out.println(board.getspace(22));
    System.out.println(board.getspace(32));

    // Initialize the dice
    Dice dice = new Dice();

    // Roll the dice and print the result
    int rollResult = dice.roll();
    System.out.println("Dice roll result: " + rollResult);

    // Print the initial state of the players
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");
    System.out.println("Player 1: " + player1);
    System.out.println("Player 2: " + player2);
  }
}