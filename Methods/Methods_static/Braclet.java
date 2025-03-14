class Braclet{
	
	public static void wear(){
		System.out.println("Running wear in Braclet");
		Wire.cut();
		Wire.attachBulb();
	}
	
	public static void make(){
		System.out.println("Running make in Braclet");
		wear();
		giftIt();
	}
	
	public static void giftIt(){
		System.out.println("Running giftIt in Braclet");
	}
	
	public static void breakIt(){
		System.out.println("Running breakIt in Braclet");
	}
}