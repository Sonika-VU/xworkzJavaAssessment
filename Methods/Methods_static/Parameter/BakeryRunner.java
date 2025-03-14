class BakeryRunner{
	public static void main(String[] args){
		String itemName = "Cake";
		int quantity = 2;
		Bakery.buy(itemName, quantity);
		
		boolean isOpen = true;
		Bakery.open(isOpen);
		
		boolean isClose = false;
		Bakery.close(isClose);
		
		String ownerName = "Raghu";
		Bakery.owner(ownerName);
		
		String cashierName = "Jiva";
		Bakery.cashier(cashierName);
	}
}