class TeddyBear {
    public static void bearSize(char size) {
        System.out.println(size);
    }

    public static void bearColor(String color) {
        System.out.println(color);
    }

    public static void bearMaterial(String material) {
        System.out.println(material);
    }

    public static void bearDetails(char size, String color) {
        System.out.println(size);
        System.out.println(color);
    }

    public static void giftFor(String occasion, String recipient) {
        System.out.println(occasion);
        System.out.println(recipient);
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