class Currency{
	
	public static void count(){
		System.out.println("Running count in currency");
		Wallet.design();
		Wallet.takeOut();
	}
	
	public static void convert(){
		System.out.println("Running convert in currency");
		count();
		manufacture();
	}
	
	public static void manufacture(){
		System.out.println("Running manufacture in currency");
	}
	
	public static void cease(){
		System.out.println("Running cease in currency");
	}
}