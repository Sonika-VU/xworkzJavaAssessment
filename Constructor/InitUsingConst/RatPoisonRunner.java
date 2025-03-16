class RatPoisonRunner {
	
	public static void main(String[] main){
		RatPoison ratPoison1 = new RatPoison(30, 50, "solid");
		RatPoison ratPoison2 = new RatPoison(100, 1, "gelly");
		RatPoison ratPoison3 = new RatPoison(250, 100, "gas");
		RatPoison ratPoison4 = new RatPoison(90, 30, "liquid");
		RatPoison ratPoison5 = new RatPoison(50, 100, "solid");
		
		System.out.println("ratPoison1 price : " + ratPoison1.price);
		System.out.println("ratPoison1 quantity : " +ratPoison1.quantity);
		System.out.println("ratPoison1 state : "+ratPoison1.state);
		
		System.out.println("======================");
		
		System.out.println("ratPoison2 price : " + ratPoison2.price);
		System.out.println("ratPoison2 quantity : " +ratPoison2.quantity);
		System.out.println("ratPoison2 state : "+ratPoison2.state);
		
		System.out.println("======================");
		
		System.out.println("ratPoison3 price : " + ratPoison3.price);
		System.out.println("ratPoison3 quantity : " +ratPoison3.quantity);
		System.out.println("ratPoison3 state : "+ratPoison3.state);
		
		System.out.println("======================");
		
		System.out.println("ratPoison4 price : " + ratPoison4.price);
		System.out.println("ratPoison4 quantity : " +ratPoison4.quantity);
		System.out.println("ratPoison4 state : "+ratPoison4.state);
		
		System.out.println("======================");
		
		System.out.println("ratPoison5 price : " + ratPoison5.price);
		System.out.println("ratPoison5 quantity : " +ratPoison5.quantity);
		System.out.println("ratPoison5 state : "+ratPoison5.state);
		
		
	}
}