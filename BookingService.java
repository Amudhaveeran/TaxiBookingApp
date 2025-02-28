import java.util.ArrayList;

class BookingService {
    private ArrayList<Taxi> taxis;
    private ArrayList<Booking> bookings;

    public BookingService() {
        taxis = new ArrayList<>();
        bookings = new ArrayList<>();
        initializeTaxis();
    }

    private void initializeTaxis() {
        taxis.add(new Taxi(1, 2));
        taxis.add(new Taxi(2, 5));
        taxis.add(new Taxi(3, 8));
    }

    public void bookTaxi(int pickup, int drop) {
        Taxi nearestTaxi = findNearestAvailableTaxi(pickup);
        if (nearestTaxi == null) {
            System.out.println("❌ No taxis available!");
            return;
        }

        nearestTaxi.setAvailable(false);
        Booking booking = new Booking(nearestTaxi, pickup, drop);
        bookings.add(booking);
        System.out.println("✅ Booking successful: " + booking);
    }

    private Taxi findNearestAvailableTaxi(int pickup) {
        Taxi nearestTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        for (Taxi taxi : taxis) {
            if (taxi.isAvailable()) {
                int distance = Math.abs(taxi.getLocation() - pickup);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestTaxi = taxi;
                }
            }
        }
        return nearestTaxi;
    }

    public void showTaxis() {
        for (Taxi taxi : taxis) {
            System.out.println(taxi);
        }
    }
}
