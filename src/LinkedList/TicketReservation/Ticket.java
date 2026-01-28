package LinkedList.TicketReservation;

import java.time.LocalDateTime;

public class Ticket {

    private final String ticketId;
    private final String customerName;
    private final String movieName;
    private final String seatNumber;
    private final LocalDateTime bookingTime;

    public Ticket(String ticketId, String customerName,
                  String movieName, String seatNumber,
                  LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
}
