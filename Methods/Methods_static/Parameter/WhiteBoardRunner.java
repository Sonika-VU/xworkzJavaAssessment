class WhiteBoardRunner {
    public static void main(String[] args) {
        String size = "4x6 feet";
        double weight = 12.5;
        String color = "White";
        String material = "Magnetic";

        String purpose = "Teaching";
        int duration = 2;

        int orderId = 456;
        String customerName = "Amit";
        boolean isPaid = true;

        int workerId = 203;
        String task = "Mounting board";
        double hoursTaken = 1.5;

        WhiteBoard.boardSize(size);
        WhiteBoard.boardWeight(weight);
        WhiteBoard.boardColor(color);
        WhiteBoard.boardDetails(size, material);
        WhiteBoard.boardUsage(purpose, duration);
        WhiteBoard.orderedBy(orderId, customerName, isPaid);
        WhiteBoard.installedBy(workerId, task, hoursTaken);
    }
}
