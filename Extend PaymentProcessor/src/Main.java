//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard("1234-5678-9012-3456");
        PayPal payPal = new PayPal("mwlouise@gmail.com");
        Bitcoin bitcoin = new Bitcoin("TXN123BTC456");
        ApplePay applePay = new ApplePay("Device-001");

        System.out.println("--- Testing Payment Methods ---");
        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay);
    }
}