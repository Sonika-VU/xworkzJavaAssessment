class Country{
	
	public static void printCountry(String[] countries){
		System.out.println("The name of the countries ending with 'a' are : ");
		for(String country : countries){
			int index = country.length() -1;
			if(country.charAt(index) == 'a' ){
				System.out.println(country);
			}
		}
		
	}
}