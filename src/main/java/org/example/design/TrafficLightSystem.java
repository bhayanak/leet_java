package org.example.design;

/**
 * TrafficLightSystem
 *
 * Problem: Design a traffic light system in Java using the State pattern.
 *
 * Approach: Use State pattern to encapsulate state-specific behavior and transitions.
 * This is a classic state machine and design patterns problem.
 *
 * Example: Traffic light cycles through Red -&gt; Green -&gt; Yellow -&gt; Red.
 */
interface TrafficLightState {
    void next(TrafficLight light);
    String getColor();
}
class RedState implements TrafficLightState {
    public void next(TrafficLight light) { light.setState(new GreenState()); }
    public String getColor() { return "Red"; }
}
class GreenState implements TrafficLightState {
    public void next(TrafficLight light) { light.setState(new YellowState()); }
    public String getColor() { return "Green"; }
}
class YellowState implements TrafficLightState {
    public void next(TrafficLight light) { light.setState(new RedState()); }
    public String getColor() { return "Yellow"; }
}
class TrafficLight {
    private TrafficLightState state;
    /**
     * Initializes the traffic light to Red state.
     */
    public TrafficLight() { state = new RedState(); }
    /**
     * Sets the current state.
     */
    public void setState(TrafficLightState state) { this.state = state; }
    /**
     * Advances to the next state.
     */
    public void next() { state.next(this); }
    /**
     * Gets the current color.
     */
    public String getColor() { return state.getColor(); }
}
/**
 * Main class to demonstrate traffic light system.
 */
public class TrafficLightSystem {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 6; i++) {
            System.out.println(light.getColor());
            light.next();
        }
    }
}
