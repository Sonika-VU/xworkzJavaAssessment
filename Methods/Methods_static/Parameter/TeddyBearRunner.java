class TeddyBearRunner {
    public static void main(String[] args) {
        char size = 'L';
        String color = "Brown";
        String material = "Plush";

        String occasion = "Birthday";
        String recipient = "Child";

        int orderId = 1023;
        String customerName = "Meera";
        boolean isPaid = true;

        int factoryId = 305;
        String batchCode = "TB2025";
        int quantity = 500;

        TeddyBear.bearSize(size);
        TeddyBear.bearColor(color);
        TeddyBear.bearMaterial(material);
        TeddyBear.bearDetails(size, color);
        TeddyBear.giftFor(occasion, recipient);
        TeddyBear.purchasedBy(orderId, customerName, isPaid);
        TeddyBear.manufacturedBy(factoryId, batchCode, quantity);
    }
}