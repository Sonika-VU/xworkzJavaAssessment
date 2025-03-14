class Dmart {
    public static void productName(String name) {
        System.out.println(name);
    }

    public static void productPrice(double price) {
        System.out.println(price);
    }

    public static void productCategory(String category) {
        System.out.println(category);
    }

    public static void productDetails(String name, double price) {
        System.out.println(name);
        System.out.println(price);
    }

    public static void discountOffer(String offerType, int discountPercentage) {
        System.out.println(offerType);
        System.out.println(discountPercentage);
    }

    public static void purchasedBy(int orderId, String customerName, boolean isPaid) {
        System.out.println(orderId);
        System.out.println(customerName);
        System.out.println(isPaid);
    }

    public static void stockedBy(int supplierId, String productName, int quantity) {
        System.out.println(supplierId);
        System.out.println(productName);
        System.out.println(quantity);
    }
}
