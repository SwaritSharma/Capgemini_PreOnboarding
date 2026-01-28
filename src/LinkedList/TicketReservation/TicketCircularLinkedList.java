package LinkedList.TicketReservation;

import LinkedList.Node;

public class TicketCircularLinkedList {

    private Node<Ticket> head;

    public void addTicket(Ticket ticket) {

        Node<Ticket> newNode = new Node<>(ticket);

        if (head == null) {
            head = newNode;
            head.next = head; // circular
            return;
        }

        Node<Ticket> temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void removeByTicketId(String ticketId) {

        if (head == null) return;

        if (head.next == head && head.data.getTicketId().equals(ticketId)) {
            head = null;
            return;
        }

        if (head.data.getTicketId().equals(ticketId)) {
            Node<Ticket> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return;
        }

        Node<Ticket> curr = head;
        while (curr.next != head) {
            if (curr.next.data.getTicketId().equals(ticketId)) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node<Ticket> temp = head;
        do {
            printTicket(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomerName(String name) {

        if (head == null) return;

        Node<Ticket> temp = head;
        do {
            if (temp.data.getCustomerName().equalsIgnoreCase(name)) {
                printTicket(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByMovieName(String movie) {

        if (head == null) return;

        Node<Ticket> temp = head;
        do {
            if (temp.data.getMovieName().equalsIgnoreCase(movie)) {
                printTicket(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
    }

    /* ---------- COUNT ---------- */

    public int countTickets() {

        if (head == null) return 0;

        int count = 1;
        Node<Ticket> temp = head.next;

        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void printTicket(Ticket t) {
        System.out.println(
                "TicketId=" + t.getTicketId() +
                        ", Customer=" + t.getCustomerName() +
                        ", Movie=" + t.getMovieName() +
                        ", Seat=" + t.getSeatNumber() +
                        ", Time=" + t.getBookingTime()
        );
    }
}
