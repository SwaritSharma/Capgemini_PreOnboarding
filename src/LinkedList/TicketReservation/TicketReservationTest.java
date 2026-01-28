package LinkedList.TicketReservation;

import java.time.LocalDateTime;

public class TicketReservationTest {

    public static void main(String[] args) {

        TicketCircularLinkedList system = new TicketCircularLinkedList();

        system.addTicket(new Ticket("T1", "Aman", "Inception",
                "A1", LocalDateTime.now()));

        system.addTicket(new Ticket("T2", "Riya", "Inception",
                "A2", LocalDateTime.now()));

        system.addTicket(new Ticket("T3", "Kunal", "Avatar",
                "B1", LocalDateTime.now()));

        System.out.println("All Tickets:");
        system.displayTickets();

        System.out.println("\nSearch by Customer Name (Riya):");
        system.searchByCustomerName("Riya");

        System.out.println("\nSearch by Movie Name (Inception):");
        system.searchByMovieName("Inception");

        system.removeByTicketId("T2");

        System.out.println("\nAfter Removing Ticket T2:");
        system.displayTickets();

        System.out.println("\nTotal Tickets Booked: " +
                system.countTickets());
    }
}
