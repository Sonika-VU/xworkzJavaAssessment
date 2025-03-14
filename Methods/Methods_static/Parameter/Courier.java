class Courier{
	
	public static void pickUp(String name){
		System.out.println("Running Courier in pickUp");
		Station.send(name);
	}
}