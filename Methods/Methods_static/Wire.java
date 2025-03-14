class Wire{
	public static void join(){
		System.out.println("Running join in Wire");
		Gold.makeOrnaments();
		Gold.keepInBank();
	}
	
	public static void cut(){
		System.out.println("Running cut in Wire");
		join();
		passElectricity();
	}
	
	public static void passElectricity(){
		System.out.println("Running passElectricity in Wire");
	}
	
	public static void attachBulb(){
		System.out.println("Running attachBulb in Wire");
	}
}