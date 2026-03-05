package org.example.design;

/**
 * 16. Design a logging framework in Java that supports multiple outputs (console, file, database) and can be extended easily.
 *
 * Problem: Use Decorator, Singleton, and Observer patterns for extensibility and single instance.
 *
 * Approach: Decorator adds features, Singleton ensures one logger, Observer allows multiple outputs.
 * This is a classic extensibility and design patterns problem.
 */
import java.util.*;

interface LogOutput {
    void log(String message);
}
class ConsoleOutput implements LogOutput {
    public void log(String message) { System.out.println(message); }
}
class FileOutput implements LogOutput {
    public void log(String message) { /* Write to file (omitted) */ }
}
class DatabaseOutput implements LogOutput {
    public void log(String message) { /* Write to DB (omitted) */ }
}

class Logger {
    private static Logger instance;
    private final List<LogOutput> outputs = new ArrayList<>();
    private Logger() {}
    public static synchronized Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
    public void addOutput(LogOutput output) { outputs.add(output); }
    public void log(String message) { for (LogOutput o : outputs) o.log(message); }
}

public class LoggingFramework {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.addOutput(new ConsoleOutput());
        logger.log("Hello, Logger!");
    }
}

