package LinkedList.SocialMediaFriendConnection;

public class SocialMediaTest {

    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(new User("U1", "Aman", 21));
        network.addUser(new User("U2", "Riya", 20));
        network.addUser(new User("U3", "Kunal", 22));
        network.addUser(new User("U4", "Neha", 21));

        network.addFriend("U1", "U2");
        network.addFriend("U1", "U3");
        network.addFriend("U2", "U3");
        network.addFriend("U2", "U4");

        network.displayFriends("U2");

        network.findMutualFriends("U1", "U2");

        network.removeFriend("U1", "U2");

        System.out.println("\nAfter Removing Friend:");
        network.displayFriends("U1");

        System.out.println();
        network.countFriends();
    }
}
