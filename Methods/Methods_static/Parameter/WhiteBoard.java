class WhiteBoard {
    public static void boardSize(String size) {
        System.out.println(size);
    }

    public static void boardWeight(double weight) {
        System.out.println(weight);
    }

    public static void boardColor(String color) {
        System.out.println(color);
    }

    public static void boardDetails(String size, String material) {
        System.out.println(size);
        System.out.println(material);
    }

    public static void boardUsage(String purpose, int duration) {
        System.out.println(purpose);
        System.out.println(duration);
    }

    public static void orderedBy(int orderId, String customerName, boolean isPaid) {
        System.out.println(orderId);
        System.out.println(customerName);
        System.out.println(isPaid);
    }

    public static void installedBy(int workerId, String task, double hoursTaken) {
        System.out.println(workerId);
        System.out.println(task);
        System.out.println(hoursTaken);
    }
}
