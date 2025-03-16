class ChainRunner {

	public static void main(String[] args){
		Chain chain1 = new Chain("Gold",800000, 's' );
		Chain chain2 = new Chain("Silver",10000, 'l' );
		Chain chain3 = new Chain("Thread",500, 'm' );
		Chain chain4 = new Chain("Pearl",1000000, 'l' );
		Chain chain5 = new Chain("Beads",200, 'l' );
		
		System.out.println(" chain1 material : " + chain1.material);
		System.out.println(" chain1 price : " + chain1.price);
		System.out.println(" chain1 size : " + chain1.size);
		
		System.out.println("======================");
		
		System.out.println(" chain2 material : " + chain2.material);
		System.out.println(" chain2 price : " + chain2.price);
		System.out.println(" chain2 size : " + chain2.size);
		
		System.out.println("======================");
		
		System.out.println(" chain3 material : " + chain3.material);
		System.out.println(" chain3 price : " + chain3.price);
		System.out.println(" chain3 size : " + chain3.size);
		
		System.out.println("======================");
		
		System.out.println(" chain4 material : " + chain4.material);
		System.out.println(" chain4 price : " + chain4.price);
		System.out.println(" chain4 size : " + chain4.size);
		
		System.out.println("======================");
		
		System.out.println(" chain5 material : " + chain5.material);
		System.out.println(" chain5 price : " + chain5.price);
		System.out.println(" chain5 size : " + chain5.size);
		
		
		
	}
}