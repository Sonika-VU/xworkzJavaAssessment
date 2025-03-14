class Broker{
	public static void brokerage(String vegetable, int quantity){
		System.out.println("Running brokerage in Broker");
		Farmer.farm(vegetable, quantity);
	}
}