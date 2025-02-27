public class Player {
    private String name;
    private int money;
    private int position;

    public Player(String name) {
        this.name = name;
        this.money = 1500; // Starting money
        this.position = 0; // Start at GO
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public boolean subtractMoney(int amount) {
        if (this.money >= amount) {
            this.money -= amount;
            return true;
        }
        return false;
    }
}
