public class Bank {
    private int money;
    private int houses;
    private int hotels;
    private int tokens;
    private int chestAndCardSpots;
    public Bank() {
        money = 0;
        houses = 32;
        hotels = 12;
        tokens = 16;
        chestAndCardSpots = 16;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getHouses() {
        return houses;
    }
    public void setHouses(int houses) {
        this.houses = houses;
    }
    public int getHotels() {
        return hotels;
    }
    public void setHotels(int hotels) {
        this.hotels = hotels;
    }
    public int getTokens() {
        return tokens;
    }
    public void setTokens(int tokens) {
        this.tokens = tokens;
    }
    public int getChestAndCardSpots() {
        return chestAndCardSpots;
    }
    public void setChestAndCardSpots(int chestAndCardSpots) {
        this.chestAndCardSpots = chestAndCardSpots;
    }
    public void addMoney(int money) {
        this.money += money;
    }
    public void removeMoney(int money) {
        this.money -= money;
    }
    public void addHouses(int houses) {
        this.houses += houses;
    }
    public void removeHouses(int houses) {
        this.houses -= houses;
    }
    public void addHotels(int hotels) {
        this.hotels += hotels;
    }
    public void removeHotels(int hotels) {
        this.hotels -= hotels;
    }
    public void addTokens(int tokens) {
        this.tokens += tokens;
    }
    public void removeTokens(int tokens) {
        this.tokens -= tokens;
    }
    public void addChestAndCardSpots(int chestAndCardSpots) {
        this.chestAndCardSpots += chestAndCardSpots;
    }
    public void removeChestAndCardSpots(int chestAndCardSpots) {
        this.chestAndCardSpots -= chestAndCardSpots;
    }
}
