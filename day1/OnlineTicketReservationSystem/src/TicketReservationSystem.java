class TicketReservationSystem {
    private Ticket last;
    private int ticketCount;

    public TicketReservationSystem() {
        last = null;
        ticketCount = 0;
    }

    // Add a new ticket reservation at the end**
    public void bookTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        ticketCount++;
    }

    // Remove a ticket by Ticket ID**
    public void cancelTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        Ticket current = last.next, prev = last;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                if (current == last.next && current == last) {
                    last = null; // Only one ticket case
                } else if (current == last.next) {
                    last.next = current.next; // Remove first ticket
                } else if (current == last) {
                    prev.next = last.next;
                    last = prev; // Remove last ticket
                } else {
                    prev.next = current.next; // Remove middle ticket
                }
                ticketCount--;
                System.out.println("Ticket ID " + ticketId + " canceled.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("Ticket ID " + ticketId + " not found.");
        }
    }

    // Display all booked tickets**
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("\nBooked Tickets:");
        Ticket current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // **Search for a ticket by Customer Name**
    public void searchByCustomer(String customerName) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket Found - ID: " + current.ticketId + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found for " + customerName);
        }
    }

    // Search for a ticket by Movie Name**
    public void searchByMovie(String movieName) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket Found - ID: " + current.ticketId + ", Customer: " + current.customerName + ", Seat: " + current.seatNumber);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found for movie " + movieName);
        }
    }

    // Get total number of booked tickets**
    public int getTotalTickets() {
        return ticketCount;
    }
}