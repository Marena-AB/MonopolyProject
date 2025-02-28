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

    // moved from Gameboard class and altered
    public void buyProperty(Property property) {
        if (money >= property.getPrice()) {
            money -= property.getPrice();
            property.setOwner(this);
            System.out.println(name + " bought " + property.getName());
        } else{
            System.out.println(name + " does not have enough money to buy " + property.getName());
        }
    }

    public void payRent(Player owner, int amount){
        money -= amount;
        owner.recieveRent(amount);
        System.out.println(name + " paid $" + amount + " rent to " + owner.getName());
    }

    public void recieveRent(int amount){
        money += amount;
    }

//    // moved from Gameboard class
//    // is this necessary anymore?
//    public void upgradeProperty(int position) {
//        if (spaces.get(position) instanceof Property) {
//            Property prop = (Property) spaces.get(position);
//            prop.addHouse();
//            System.out.println("Upgraded " + prop.name + " to " + prop.houses + " houses, Hotel: " + (prop.hasHotel ? "Yes" : "No"));
//        } else {
//            System.out.println("This space is not a property.");
//        }
//    }

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
