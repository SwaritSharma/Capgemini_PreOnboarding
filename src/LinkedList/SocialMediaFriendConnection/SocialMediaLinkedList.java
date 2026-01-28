package LinkedList.SocialMediaFriendConnection;

import LinkedList.Node;

public class SocialMediaLinkedList {

    private Node<User> head;

    public void addUser(User user) {
        Node<User> newNode = new Node<>(user);
        newNode.next = head;
        head = newNode;
    }

    public User searchByUserId(String userId) {
        Node<User> temp = head;

        while (temp != null) {
            if (temp.data.getUserId().equals(userId)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public User searchByName(String name) {
        Node<User> temp = head;

        while (temp != null) {
            if (temp.data.getName().equalsIgnoreCase(name)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(String userId1, String userId2) {

        User u1 = searchByUserId(userId1);
        User u2 = searchByUserId(userId2);

        if (u1 == null || u2 == null) return;

        addFriendToList(u1, userId2);
        addFriendToList(u2, userId1);
    }

    private void addFriendToList(User user, String friendId) {
        Node<String> newNode = new Node<>(friendId);
        newNode.next = user.friendsHead;
        user.friendsHead = newNode;
    }

    public void removeFriend(String userId1, String userId2) {
        User u1 = searchByUserId(userId1);
        User u2 = searchByUserId(userId2);

        if (u1 == null || u2 == null) return;

        removeFriendFromList(u1, userId2);
        removeFriendFromList(u2, userId1);
    }

    private void removeFriendFromList(User user, String friendId) {

        Node<String> temp = user.friendsHead;

        if (temp == null) return;

        if (temp.data.equals(friendId)) {
            user.friendsHead = temp.next;
            return;
        }

        while (temp.next != null) {
            if (temp.next.data.equals(friendId)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayFriends(String userId) {

        User user = searchByUserId(userId);
        if (user == null) return;

        System.out.println("Friends of " + user.getName() + ":");

        Node<String> temp = user.friendsHead;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void findMutualFriends(String userId1, String userId2) {

        User u1 = searchByUserId(userId1);
        User u2 = searchByUserId(userId2);

        if (u1 == null || u2 == null) return;

        System.out.println("Mutual Friends:");

        Node<String> f1 = u1.friendsHead;

        while (f1 != null) {
            if (isFriend(u2.friendsHead, f1.data)) {
                System.out.println(f1.data);
            }
            f1 = f1.next;
        }
    }

    private boolean isFriend(Node<String> head, String id) {
        while (head != null) {
            if (head.data.equals(id)) return true;
            head = head.next;
        }
        return false;
    }

    public void countFriends() {
        Node<User> temp = head;

        while (temp != null) {
            int count = 0;
            Node<String> f = temp.data.friendsHead;

            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(
                    temp.data.getName() + " has " + count + " friends"
            );

            temp = temp.next;
        }
    }
}
