class RegionalPostHeadMaster{
	public static void  deliver(String custName, String address){
		System.out.println("Running deliver in RegionalPostHeadMaster");
		PostHeadMaster.deliver(custName, address);
	} 
			
}