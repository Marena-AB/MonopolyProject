public class CommunityChestSpot {

    private String name;
    private int position;
    private String type;

    public CommunityChestSpot(String name, int position) {
        this.name = name;
        this.position = position;
        this.type = "Community Chest";
    }

    @Override
    public String toString() {
        return position + ": " + name + " (" + type + ")";
    }




}
