class Wallet{
	public static void keepMoney(){
		System.out.println("Running keepMoney in Wallet");
		Perfume.spray();
		Perfume.pack();
	}
	
	public static void design(){
		System.out.println("Running design in Wallet");
		keepMoney();
		giftIt();
	}
	
	public static void giftIt(){
		System.out.println("Running giftIt in Wallet");
	}
	
	public static void takeOut(){
		System.out.println("Running takeOut in Wallet");
	}
}