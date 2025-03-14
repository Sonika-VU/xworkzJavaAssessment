class LadderRunner{
	public static void main(String[] args){
		String oName = "Ramu";
		int len = 12;
		double cost = 130.32;
		String shopAddress = "Bangalore";
		int shopNo = 123;
		String shopName = "xyz";
		String receriverName = "Meena";
		long receiverPhNo = 8795443;
		String receiverAddress = "Nelmangla";
		
		Ladder.owner(oName);
		Ladder.length(len);
		Ladder.price(cost);
		Ladder.ownerAddress(oName,shopAddress);
		Ladder.shopDetails(shopName, shopNo);
		Ladder.sender(shopName, oName, shopAddress);
		Ladder.receiver(receriverName, receiverPhNo, receiverAddress);
		
	}
}