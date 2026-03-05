package org.example.chatroom;

import java.util.*;

/**
 * ChatRoomSystem
 *
 * Problem: Design a chat room system. Would you use Observer or Mediator pattern? Why?
 *
 * Approach: Use Mediator for message routing, Observer for user notification.
 * This is a classic communication and design patterns problem.
 *
 * Example: Alice and Bob join a chat room. Alice sends a message, Bob receives it.
 */
interface User {
    void receive(String message);
    String getName();
}

class ChatUser implements User {
    private final String name;
    public ChatUser(String name) { this.name = name; }
    public void receive(String message) { System.out.println(name + " received: " + message); }
    public String getName() { return name; }
}

class ChatRoom {
    private final List<User> users = new ArrayList<>();
    /**
     * Adds a user to the chat room.
     */
    public void join(User user) { users.add(user); }
    /**
     * Sends a message from one user to all others.
     */
    public void send(String from, String message) {
        for (User user : users) {
            if (!user.getName().equals(from)) user.receive(from + ": " + message);
        }
    }
}

/**
 * Main class to demonstrate chat room system.
 */
public class ChatRoomSystem {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User alice = new ChatUser("Alice");
        User bob = new ChatUser("Bob");
        room.join(alice); room.join(bob);
        room.send("Alice", "Hello, Bob!");
    }
}
