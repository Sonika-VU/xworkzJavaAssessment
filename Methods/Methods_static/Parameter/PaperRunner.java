class PaperRunner {
    public static void main(String[] args) {
        int sheets = 500;
        String type = "A4 Glossy";
        double weight = 80.0;

        String usage = "Printing";
        String size = "A4";

        int orderId = 321;
        String buyerName = "Neha";
        boolean isPaid = true;

        int workerId = 102;
        String task = "Cutting sheets";
        boolean isCompleted = false;

        Paper.paperSheets(sheets);
        Paper.paperType(type);
        Paper.paperWeight(weight);
        Paper.paperDetails(sheets, type);
        Paper.paperUsage(usage, size);
        Paper.orderedBy(orderId, buyerName, isPaid);
        Paper.processedBy(workerId, task, isCompleted);
    }
}
