class Pineapple{
	
	public static void removeSkin(){
		System.out.println("Running removeSkin in Pineapple");
		Brand.createLogo();
		Brand.makeProducts();
	}
	
	public static void cut(){
		System.out.println("Running cut in Pineapple");
		removeSkin();
		makeJuice();
	}
	
	public static void makeJuice(){
		System.out.println("Running makeJuice in Pineapple");
	}
	
	public static void roast(){
		System.out.println("Running roast in Pineapple");
	}
}