public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Booking tickets
        system.bookTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.bookTicket(102, "Bob", "Interstellar", "B2", "1:00 PM");
        system.bookTicket(103, "Charlie", "Inception", "A2", "10:00 AM");

        // Display tickets
        system.displayTickets();

        // Search by customer name
        System.out.println("\nSearching for Bob's ticket:");
        system.searchByCustomer("Bob");

        // Search by movie name
        System.out.println("\nSearching for tickets of 'Inception':");
        system.searchByMovie("Inception");

        // Cancel a ticket
        System.out.println("\nCanceling Ticket ID 102...");
        system.cancelTicket(102);
        system.displayTickets();

        // Display total tickets
        System.out.println("\nTotal Tickets Booked: " + system.getTotalTickets());
    }
}