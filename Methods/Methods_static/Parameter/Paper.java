class Paper {
    public static void paperSheets(int sheets) {
        System.out.println(sheets);
    }

    public static void paperType(String type) {
        System.out.println(type);
    }

    public static void paperWeight(double weight) {
        System.out.println(weight);
    }

    public static void paperDetails(int sheets, String type) {
        System.out.println(sheets);
        System.out.println(type);
    }

    public static void paperUsage(String usage, String size) {
        System.out.println(usage);
        System.out.println(size);
    }

    public static void orderedBy(int orderId, String buyerName, boolean isPaid) {
        System.out.println(orderId);
        System.out.println(buyerName);
        System.out.println(isPaid);
    }

    public static void processedBy(int workerId, String task, boolean isCompleted) {
        System.out.println(workerId);
        System.out.println(task);
        System.out.println(isCompleted);
    }
}
