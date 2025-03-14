class Mask {
    public static void maskType(String type) {
        System.out.println(type);
    }

    public static void maskPrice(double price) {
        System.out.println(price);
    }

    public static void maskStock(int stock) {
        System.out.println(stock);
    }

    public static void maskDetails(String type, String color) {
        System.out.println(type);
        System.out.println(color);
    }

    public static void protectionLevel(String level, boolean isReusable) {
        System.out.println(level);
        System.out.println(isReusable);
    }

    public static void purchasedBy(int orderId, String customerName, boolean isPaid) {
        System.out.println(orderId);
        System.out.println(customerName);
        System.out.println(isPaid);
    }

    public static void manufacturedBy(int factoryId, String batchCode, int quantity) {
        System.out.println(factoryId);
        System.out.println(batchCode);
        System.out.println(quantity);
    }
}
