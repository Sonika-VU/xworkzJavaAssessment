class Runner {
	
	public static void main(String[] args){
		
		Balloon balloon1 = new Balloon("Red", "Round", 2, 150, 15, true);
		balloon1.display();
		
		Balloon balloon2 = new Balloon("Blue", "Heart", 3, 200, 5, false);
		balloon2.display();
		
		Balloon balloon3 = new Balloon("Orange", "Oval", 5, 500, 10, true);
		balloon3.display();
		
		Balloon balloon4 = new Balloon("Green", "Letter", 1, 50, 15, false);
		balloon4.display();
		
		Balloon balloon5 = new Balloon("White", "Round",6, 400, 15, true);
		balloon5.display();
		
		Balloon balloon6 = new Balloon("Yellow", "Heart", 8, 800, 5, false);
		balloon6.display();
		
		Balloon balloon7 = new Balloon("Purple", "Oval", 1, 100, 10, true);
		balloon7.display();
		
		Holi holi1 = new Holi("Bhashyam circle", 14, "Friday", 100, true, true);
		holi1.display();
		
		Holi holi2 = new Holi("RamMandir", 15, "Saturday", 500,false, true);
		holi2.display();
		
		Holi holi3 = new Holi("Vijaynagar", 16, "Sunday", 50, false, true);
		holi3.display();
		
		Holi holi4 = new Holi("Hospet", 14, "Friday", 100, true, true);
		holi4.display();
		
		Holi holi5 = new Holi("RamAndCo", 15, "Saturday", 800, true, true);
		holi5.display();
		
		Holi holi6 = new Holi("MG Road", 16, "Sunday", 400, true, true);
		holi6.display();
		
		Holi holi7 = new Holi("Chickept", 14, "Friday", 1000, true, true);
		holi7.display();
		
		Pichkari pichkari1 = new Pichkari("Blue", 100, 20, 's', "instamart", "Gun");
		pichkari1.display();
		
		Pichkari pichkari2 = new Pichkari("Red", 200, 10, 's', "zepto", "Flower");
		pichkari2.display();
		
		Pichkari pichkari3 = new Pichkari("Pink", 500, 30, 'm', "blinkit", "Elephant");
		pichkari3.display();
		
		Pichkari pichkari4 = new Pichkari("Purple", 100, 20, 'l', "instamart", "Gun");
		pichkari4.display();
		
		Pichkari pichkari5 = new Pichkari("Black", 60, 15, 's', "zepto", "Gun");
		pichkari5.display();
		
		Pichkari pichkari6 = new Pichkari("White", 90, 15, 's', "instamart", "Tube");
		pichkari6.display();
		
		Pichkari pichkari7 = new Pichkari("Silver", 100, 20, 's', "instamart", "Elephant");
		pichkari7.display();
	}
}