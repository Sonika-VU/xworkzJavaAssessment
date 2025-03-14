class Agent{
	public static void purchase(String vegetable, int quantity){
		System.out.println("Running purchase in Agent");
		Broker.brokerage(vegetable, quantity);
	}
}