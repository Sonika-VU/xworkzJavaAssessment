class PostHeadMaster{
	public static void  deliver(String custName, String address){
		System.out.println("Running deliver in PostHeadMaster");
		PostMaster.deliver(custName, address);
	} 
			
}