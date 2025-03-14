class FoodItem{
	
	public static void printIngredients(String item){
		System.out.println("The item is " + item);
		System.out.println("The ingridents are");
		
		if(item == "Briyani"){	
			System.out.println("Rice");
			System.out.println("Chicken");
			System.out.println("Spices");
			System.out.println("Water");
			System.out.println("Masala");
		}

		else if(item == "Dosa" ){
			System.out.println("Batter, Chilli, Peanutes, Potato, Turmeric");
		}
			
	}
}