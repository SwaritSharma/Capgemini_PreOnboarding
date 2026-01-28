package LinkedList.SocialMediaFriendConnection;

import LinkedList.Node;

public class User {

    private final String userId;
    private final String name;
    private int age;

    // List of friend IDs (singly linked list)
    Node<String> friendsHead;

    public User(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
