class SugarRunner {
	public static void main(String[] args){
		Sugar sugar1 = new Sugar("white",1,20);
		Sugar sugar2 = new Sugar("brown",1,50);
		Sugar sugar3 = new Sugar("white",4,60);
		Sugar sugar4 = new Sugar("brown",5,250);
		Sugar sugar5 = new Sugar("white",10,150);
		
		System.out.println("Sugar 1 : (type, quantity, price) : " +sugar1.type +" ," +sugar1.quantity+ " ,"
		+sugar1.price);
		
		System.out.println("=====================");
		
		System.out.println("Sugar 2 : (type, quantity, price) : " +sugar2.type +" ," +sugar2.quantity+ " ,"
		+sugar2.price);
		
		System.out.println("=====================");
		
		System.out.println("Sugar 3 : (type, quantity, price) : " +sugar3.type +" ," +sugar3.quantity+ " ,"
		+sugar3.price);
		
		System.out.println("=====================");
		
		System.out.println("Sugar 4 : (type, quantity, price) : " +sugar4.type +" ," +sugar4.quantity+ " ,"
		+sugar4.price);
		
		System.out.println("=====================");
		
		System.out.println("Sugar 5 : (type, quantity, price) : " +sugar5.type +" ," +sugar5.quantity+ " ,"
		+sugar5.price);
		
	}
}