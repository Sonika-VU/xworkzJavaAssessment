class AreaPostOffice{
	public static void  deliver(String custName, String address){
		System.out.println("Running deliver in AreaPostOffice");
		SubRegionalPostHeadMaster.deliver(custName, address);
	} 
			
}