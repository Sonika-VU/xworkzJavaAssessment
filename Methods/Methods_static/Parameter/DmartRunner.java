class DmartRunner {
    public static void main(String[] args) {
        String name = "Shampoo";
        double price = 299.99;
        String category = "Personal Care";

        String offerType = "Festive Sale";
        int discountPercentage = 20;

        int orderId = 789;
        String customerName = "Rahul";
        boolean isPaid = true;

        int supplierId = 504;
        String productName = "Soap";
        int quantity = 100;

        Dmart.productName(name);
        Dmart.productPrice(price);
        Dmart.productCategory(category);
        Dmart.productDetails(name, price);
        Dmart.discountOffer(offerType, discountPercentage);
        Dmart.purchasedBy(orderId, customerName, isPaid);
        Dmart.stockedBy(supplierId, productName, quantity);
    }
}
