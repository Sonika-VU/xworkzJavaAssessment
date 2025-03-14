class Shop{
	public static void sell(String vegetable, int quantity){
		System.out.println("Running sell in Shop");
		Agent.purchase(vegetable, quantity);
	}
}