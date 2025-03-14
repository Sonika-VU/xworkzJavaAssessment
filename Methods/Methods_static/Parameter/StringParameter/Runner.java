class Runner{
	
	public static void main(String[] args){
		
		String[] emails = {"sonika@gmail.com", "radha@gmail.com", "priya@gmail.com"};
		Email.printEmails(emails);
		
		System.out.println("==========================");
		
		String[] countries = {"India", "Pakistan", "Japan", "SriLanla"};
		Country.printCountry(countries);
		
		System.out.println("==========================");
		
		char[] alphabets = {'f', 'a', 'y','v'};
		Alphabet.printInAscending(alphabets);
	
		System.out.println("==========================");
		
		String item = "Dosa";
		FoodItem.printIngredients(item);
	}
}