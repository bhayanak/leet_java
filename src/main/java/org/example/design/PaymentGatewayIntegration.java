package org.example.design;

/**
 * PaymentGatewayIntegration
 *
 * Problem: Suppose you need to integrate multiple payment gateways (PayPal, Stripe, Razorpay).
 *
 * Approach: Use Adapter to wrap each gateway, Factory to select the gateway at runtime.
 * This is a classic integration and design patterns problem.
 *
 * Example: PaymentGateway gateway = PaymentGatewayFactory.getGateway("stripe"); gateway.pay(100.0);
 */
interface PaymentGateway {
    void pay(double amount);
}

class PayPalAdapter implements PaymentGateway {
    public void pay(double amount) { System.out.println("PayPal paid: " + amount); }
}
class StripeAdapter implements PaymentGateway {
    public void pay(double amount) { System.out.println("Stripe paid: " + amount); }
}
class RazorpayAdapter implements PaymentGateway {
    public void pay(double amount) { System.out.println("Razorpay paid: " + amount); }
}

class PaymentGatewayFactory {
    /**
     * Returns a payment gateway adapter for the given type.
     */
    public static PaymentGateway getGateway(String type) {
        return switch (type) {
            case "paypal" -> new PayPalAdapter();
            case "stripe" -> new StripeAdapter();
            case "razorpay" -> new RazorpayAdapter();
            default -> throw new IllegalArgumentException("Unknown gateway");
        };
    }
}

/**
 * Main class to demonstrate payment gateway integration.
 */
public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentGateway gateway = PaymentGatewayFactory.getGateway("stripe");
        gateway.pay(100.0);
    }
}
