class TaskRunner{
	public static void main(String[] args){
		String name = Task.getNameFromMobile(398067);
		System.out.println("\tThe name is : "+name);
		
		System.out.println("\tOwner: " + Task.getOwnerFromCompany("SLK"));
		
		System.out.println("\tPrice: " +Task.getPriceFromFood("dosa"));
		
		System.out.println("\tBalance: " + Task.getBalanceFromAcc(564634));
		
		System.out.println("\tPrice: " +Task.getPriceFromSource("Drawing"));
		
		System.out.println("\tIs alive: " +Task.getAliveFromName("Modi"));
		
		
	}
}