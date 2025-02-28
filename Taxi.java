class Taxi {
    private int id;
    private boolean available;
    private int location; // Assuming location is represented as an integer (e.g., distance from a point)

    public Taxi(int id, int location) {
        this.id = id;
        this.available = true;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Taxi ID: " + id + " | Available: " + available + " | Location: " + location;
    }
}
