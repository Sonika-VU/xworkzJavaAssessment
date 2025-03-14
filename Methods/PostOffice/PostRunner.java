class PostRunner{

	public static void main(String[] args){
		System.out.println("Runnig main method");
		
		String custName = "Ramu";
		String address  = "Davanagere";
		//AreaPostOffice.deliver(custName, address);
		myMeth();
		
	}
	
	public static boolean myMeth(){
			boolean value = true;
			for(int i=0; i<3; i++){
				return value;
			}
			
			return value;
		}
}