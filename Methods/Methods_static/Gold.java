class Gold{
	public static void melt(){
		System.out.println("Running melt in Gold");
		Pineapple.cut();
		Pineapple.roast();
	}
	
	public static void makeOrnaments(){
		System.out.println("Running makeOrnaments in Gold");
		melt();
		wear();
	}
	
	public static void wear(){
		System.out.println("Running wear in Gold");
	}
	
	public static void keepInBank(){
		System.out.println("Running keepInBank in Gold");
	}
}