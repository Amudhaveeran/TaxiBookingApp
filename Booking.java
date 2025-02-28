class Booking {
    private static int counter = 1;
    private int id;
    private Taxi taxi;
    private int pickup;
    private int drop;
    private double fare;

    public Booking(Taxi taxi, int pickup, int drop) {
        this.id = counter++;
        this.taxi = taxi;
        this.pickup = pickup;
        this.drop = drop;
        this.fare = calculateFare();
    }

    private double calculateFare() {
        return Math.abs(drop - pickup) * 10; // ₹10 per unit distance
    }

    @Override
    public String toString() {
        return "Booking ID: " + id + " | Taxi: " + taxi.getId() + " | Fare: ₹" + fare;
    }
}
