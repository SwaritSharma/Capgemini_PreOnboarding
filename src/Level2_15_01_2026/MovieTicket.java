package Level2_15_01_2026;

class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket Booked Successfully");
    }

    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();
        ticket.movieName = "Inception";

        ticket.bookTicket(12, 350);
        ticket.displayTicketDetails();
    }
}
