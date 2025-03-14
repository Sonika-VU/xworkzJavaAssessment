class Station{
	
	public static void send(String name){
		System.out.println("Running send in Station");
		DeliveryGuy.accept(name);
	}
}