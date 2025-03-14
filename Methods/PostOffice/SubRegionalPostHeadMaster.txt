class SubRegionalPostHeadMaster{
	public static void  deliver(String custName, String address){
		System.out.println("Running deliver in SubRegionalPostHeadMaster");
		RegionalPostHeadMaster.deliver(custName, address);
	} 
			
}