class FoodItem{
	public static void totalItems(int quantity){
		System.out.println(quantity);
	}
	
	public static void item(String itemName){
		System.out.println(itemName);
	}
	
	public static void totCost(double price){
		System.out.println(price);
	}
	
	public static void orderDetails(int quantity, String itemName){
		System.out.println(quantity);
		System.out.println(itemName);
	}
	
	public static void extra(String ing1, String ing2 ){
		System.out.println(ing1);
		System.out.println(ing2);
	}
	
	public static void orderedBy(int tableNo, String pName, boolean paid){
		System.out.println(tableNo);
		System.out.println(pName);
		System.out.println(paid);
	}
	
	public static void preparedBy(int chefId, String itemName, boolean isDone){
		System.out.println(chefId);
		System.out.println(itemName);
		System.out.println(isDone);
	}
}