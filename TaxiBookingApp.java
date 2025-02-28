import java.util.Scanner;

public class TaxiBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();

        while (true) {
            System.out.println("\n=== Taxi Booking System ===");
            System.out.println("1. Book a Taxi");
            System.out.println("2. Show Available Taxis");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Pickup Location (0-10): ");
                    int pickup = scanner.nextInt();
                    System.out.print("Enter Drop Location (0-10): ");
                    int drop = scanner.nextInt();
                    bookingService.bookTaxi(pickup, drop);
                    break;
                case 2:
                    bookingService.showTaxis();
                    break;
                case 3:
                    System.out.println("🚖 Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
    }
}
