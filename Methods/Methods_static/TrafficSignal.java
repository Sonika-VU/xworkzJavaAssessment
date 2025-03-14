class TrafficSignal{
	public static void stop(){
		System.out.println("Running stop in TrafficSignal");
		LipStick.apply();
		LipStick.giftIt();
	}
	
	public static void ready(){
		System.out.println("Running ready in TrafficSignal");
		stop();
		go();
	}
	
	public static void go(){
		System.out.println("Running go in TrafficSignal");
	}
	
	public static void movePeople(){
		System.out.println("Running movePeople in TrafficSignal");
	}
}