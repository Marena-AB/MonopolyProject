public class Property extends Space {
    private int price;
    private int rent;
    private String colorGroup;
    private Player owner;
    private int houses;
    private boolean hasHotel;

    public Property(String name, int position, int price, int rent, String colorGroup) {
        super(name, position, "Property");
        this.price = price;
        this.rent = rent;
        this.colorGroup = colorGroup;
        this.owner = null;  // No owner initially
        this.houses = 0;
        this.hasHotel = false;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
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

    // these 2 methods might need to go somewhere else
    public boolean isOwned(){
        return owner != null;
    }
    public void onLand(Player player){
        if (isOwned() && owner != player){
            player.payRent(owner, rent);
            // TODO: Add logic for rent calculation based on houses/hotel
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Price: $" + price + ", Rent: $" + rent + ", Color: " + colorGroup +
                ", Owner: " + owner + ", Houses: " + houses + ", Hotel: " + (hasHotel ? "Yes" : "No");
    }

    public boolean hasHotel() {
        return hasHotel;
    }

    public int getHouses() {
        return houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
