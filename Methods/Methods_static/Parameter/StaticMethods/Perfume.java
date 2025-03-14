class Perfume{
	public static void manufacture(){
		System.out.println("Runnig manufacture in Perfume");
		Braclet.make();
		Braclet.breakIt();
	}
	
	public static void spray(){
		System.out.println("Runnig spray in Perfume");
		manufacture();
		advertize();
	}
	
	public static void advertize(){
		System.out.println("Runnig advertize in Perfume");
	}
	
	public static void pack(){
		System.out.println("Runnig pack in Perfume");
	}
}