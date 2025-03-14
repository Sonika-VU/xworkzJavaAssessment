class Brand{
	public static void findName(){
		System.out.println("Running findName in Brand");
		TrafficSignal.ready();
		TrafficSignal.movePeople();
	}
	
	public static void createLogo(){
		System.out.println("Running createLogo in Brand");
		findName();
		advertize();
	}
	
	public static void advertize(){
		System.out.println("Running advertize in Brand");
	}
	
	public static void makeProducts(){
		System.out.println("Running makeProducts in Brand");
	}
}