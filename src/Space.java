public abstract class Space {
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
