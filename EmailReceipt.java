public class EmailReceipt implements ReceiptSender {

    @Override
    public void sendReceipt() {
        System.out.println("Sending receipt by email...");
    }
}
