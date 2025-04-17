public class PaymentProcessor {

    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card Payment: " + creditCard.getCardNumber());
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal Payment: " + payPal.getEmail());
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment. Transaction ID: " + bitcoin.getTransactionId());
    }


    public void processPayment(ApplePay applePay) {
        System.out.println("Processing ApplePay Payment. Device ID: " + applePay.getDeviceId());
    }
}

