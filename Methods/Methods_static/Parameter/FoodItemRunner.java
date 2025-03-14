class FoodItemRunner{
	public static void main(String[] args){
	int quantity = 5;
	String itemName = "dosa";
	double price = 200;
	
	String ing1 = "chutny";
	String ing2 = "palya";
	
	int tableNo = 2;
	String pName = "Shubha";
	boolean paid = true;
	
	int chefId =101;
	boolean isDone = false;
	
	FoodItem.totalItems(quantity);
	FoodItem.item(itemName);
	FoodItem.totCost(price);
	
	FoodItem.orderDetails(quantity,itemName);
	FoodItem.extra(ing1,ing2 );
	FoodItem.orderedBy(tableNo,pName, paid);
	FoodItem.preparedBy(chefId,itemName,isDone);
	}
}