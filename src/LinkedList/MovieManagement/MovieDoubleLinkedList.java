package LinkedList.MovieManagement;

import LinkedList.Node;

public class MovieDoubleLinkedList {
    private Node<Movie> head;
    private Node<Movie> tail;

    public void addAtBeginning(Movie movie){
        Node<Movie> newNode=new Node<>(movie);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addAtEnd(Movie movie){
        Node<Movie> newNode=new Node<>(movie);

        if(tail==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=null;
    }

    public int length(){
        Node<Movie> temp=head;

        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }

    public void addAtPosition(int pos,Movie movie){
        if(pos<=0){
            return;
        }

        if(pos==1){
            addAtBeginning(movie);
            return;
        }

        if(pos>length()+1){
            return;
        }

        Node<Movie> temp=head;
        int c=1;
        while(c!=pos-1){
            c++;
            temp=temp.next;
        }

        if (temp.next == null) {
            addAtEnd(movie);
            return;
        }

        Node<Movie> join=temp.next;
        Node<Movie> newNode=new Node<>(movie);
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=join;
        join.prev=newNode;
    }

    public void displayForward() {
        Node<Movie> temp = head;

        while (temp != null) {
            Movie m = temp.data;
            System.out.println(
                    "Title: " + m.getTitle() +
                            ", Director: " + m.getDirector() +
                            ", ReleaseDate: " + m.getYear() +
                            ", Rating: " + m.getRating()
            );
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Node<Movie> temp = tail;

        while (temp != null) {
            Movie m = temp.data;
            System.out.println(
                    "Title: " + m.getTitle() +
                            ", Director: " + m.getDirector() +
                            ", ReleaseDate: " + m.getYear() +
                            ", Rating: " + m.getRating()
            );
            temp = temp.prev;
        }
    }
    public void removeByTitle(String title) {

        if (head == null) {
            return;
        }

        if (head.data.getTitle().equalsIgnoreCase(title)) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node<Movie> temp = head;

        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(title)) {

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }

                temp.prev.next = temp.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByDirector(String director) {
        Node<Movie> temp = head;

        while (temp != null) {
            if (temp.data.getDirector().equalsIgnoreCase(director)) {
                Movie m = temp.data;
                System.out.println(
                        "Title: " + m.getTitle() +
                                ", Director: " + m.getDirector() +
                                ", Year: " + m.getYear() +
                                ", Rating: " + m.getRating()
                );
            }
            temp = temp.next;
        }
    }

    public void searchByRating(double rating) {
        Node<Movie> temp = head;

        while (temp != null) {
            if (temp.data.getRating() == rating) {
                Movie m = temp.data;
                System.out.println(
                        "Title: " + m.getTitle() +
                                ", Director: " + m.getDirector() +
                                ", Year: " + m.getYear() +
                                ", Rating: " + m.getRating()
                );
            }
            temp = temp.next;
        }
    }

    public void updateRating(String title, double newRating) {
        Node<Movie> temp = head;

        while (temp != null) {
            if (temp.data.getTitle().equalsIgnoreCase(title)) {
                temp.data.setRating(newRating);
                return;
            }
            temp = temp.next;
        }
    }

    private void printMovie(Movie m) {
        System.out.println(
                "Title: " + m.getTitle() +
                        ", Director: " + m.getDirector() +
                        ", Year: " + m.getYear() +
                        ", Rating: " + m.getRating()
        );
    }




}
