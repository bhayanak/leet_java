package org.example.design;

/**
 * NotificationSystem
 *
 * Problem: Design a system in Java that can send notifications via Email, SMS, and Push.
 *
 * Approach: Use Strategy for notification methods, Factory for object creation, and Observer for event-driven notifications.
 * This is a classic design patterns problem, testing OOP and extensibility.
 *
 * Example: NotificationStrategy strategy = NotificationFactory.getNotification("email"); strategy.send("Hello!");
 */
interface NotificationStrategy {
    void send(String message);
}

class EmailNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
class SMSNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
class PushNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}

class NotificationFactory {
    /**
     * Returns a notification strategy for the given type.
     */
    public static NotificationStrategy getNotification(String type) {
        return switch (type) {
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}

interface Observer {
    void update(String message);
}

class User implements Observer {
    private final String name;
    public User(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class NotificationService {
    private final java.util.List<Observer> observers = new java.util.ArrayList<>();
    /**
     * Adds an observer to the notification service.
     */
    public void addObserver(Observer o) { observers.add(o); }
    /**
     * Notifies all observers with the given message.
     */
    public void notifyAllObservers(String message) {
        for (Observer o : observers) o.update(message);
    }
}

/**
 * Main class to demonstrate notification system.
 */
public class NotificationSystem {
    public static void main(String[] args) {
        NotificationStrategy strategy = NotificationFactory.getNotification("email");
        strategy.send("Hello!");
        NotificationService service = new NotificationService();
        service.addObserver(new User("Alice"));
        service.addObserver(new User("Bob"));
        service.notifyAllObservers("Event happened!");
    }
}
