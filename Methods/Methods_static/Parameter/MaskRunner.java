class MaskRunner {
    public static void main(String[] args) {
        String type = "N95";
        double price = 299.99;
        int stock = 500;
        String color = "Blue";
        String material = "Non-woven Fabric";

        String level = "High";
        boolean isReusable = false;

        int orderId = 2048;
        String customerName = "Ravi";
        boolean isPaid = true;

        int factoryId = 512;
        String batchCode = "M2025";
        int quantity = 1000;

        Mask.maskType(type);
        Mask.maskPrice(price);
        Mask.maskStock(stock);
        Mask.maskDetails(type, color);
        Mask.protectionLevel(level, isReusable);
        Mask.purchasedBy(orderId, customerName, isPaid);
        Mask.manufacturedBy(factoryId, batchCode, quantity);
    }
}
