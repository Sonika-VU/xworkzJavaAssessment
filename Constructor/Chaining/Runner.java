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
		
		Color color1 = new Color("Red", "Primary", 255, 0, 0, true);
        color1.display();

        Color color2 = new Color("Green", "Primary", 0, 255, 0, true);
        color2.display();

        Color color3 = new Color("Blue", "Primary", 0, 0, 255, true);
        color3.display();

        Color color4 = new Color("Yellow", "Secondary", 255, 255, 0, true);
        color4.display();

        Color color5 = new Color("Cyan", "Secondary", 0, 255, 255, false);
        color5.display();

        Color color6 = new Color("Magenta", "Secondary", 255, 0, 255, false);
        color6.display();

        Color color7 = new Color("Black", "Neutral", 0, 0, 0, false);
        color7.display();
		
		Egg egg1 = new Egg("Chicken", "Large", 60, "White", true, true);
        egg1.display();

        Egg egg2 = new Egg("Duck", "Medium", 70, "Brown", false, true);
        egg2.display();

        Egg egg3 = new Egg("Quail", "Small", 15, "Speckled", true, true);
        egg3.display();

        Egg egg4 = new Egg("Goose", "Large", 150, "White", false, true);
        egg4.display();

        Egg egg5 = new Egg("Turkey", "Large", 90, "Cream", true, false);
        egg5.display();

        Egg egg6 = new Egg("Pheasant", "Medium", 40, "Olive", false, true);
        egg6.display();

        Egg egg7 = new Egg("Ostrich", "Extra Large", 1500, "Off-white", false, false);
        egg7.display();
		
		 Bucket bucket1 = new Bucket("Plastic", "Blue", 10, true, true, true);
        bucket1.display();

        Bucket bucket2 = new Bucket("Metal", "Silver", 15, true, false, true);
        bucket2.display();

        Bucket bucket3 = new Bucket("Plastic", "Red", 12, false, true, true);
        bucket3.display();

        Bucket bucket4 = new Bucket("Wood", "Brown", 8, true, false, false);
        bucket4.display();

        Bucket bucket5 = new Bucket("Steel", "Gray", 20, true, false, true);
        bucket5.display();

        Bucket bucket6 = new Bucket("Plastic", "Green", 5, false, true, true);
        bucket6.display();

        Bucket bucket7 = new Bucket("Aluminum", "White", 25, true, false, true);
        bucket7.display();
		
		Tomato tomato1 = new Tomato("Cherry", "Red", 50, true, true, true);
        tomato1.display();

        Tomato tomato2 = new Tomato("Roma", "Red", 80, true, false, true);
        tomato2.display();

        Tomato tomato3 = new Tomato("Heirloom", "Yellow", 100, true, true, true);
        tomato3.display();

        Tomato tomato4 = new Tomato("Beefsteak", "Red", 200, false, false, true);
        tomato4.display();

        Tomato tomato5 = new Tomato("Grape", "Red", 30, true, true, false);
        tomato5.display();

        Tomato tomato6 = new Tomato("Plum", "Orange", 90, true, false, true);
        tomato6.display();

        Tomato tomato7 = new Tomato("Black Krim", "Dark Red", 150, true, true, true);
        tomato7.display();
		
		WaterBall ball1 = new WaterBall("Rubber", "Blue", 10, true, false, true);
        ball1.display();

        WaterBall ball2 = new WaterBall("Plastic", "Red", 12, true, true, false);
        ball2.display();

        WaterBall ball3 = new WaterBall("Silicone", "Green", 8, false, true, true);
        ball3.display();

        WaterBall ball4 = new WaterBall("Gel", "Transparent", 15, true, true, true);
        ball4.display();

        WaterBall ball5 = new WaterBall("Foam", "Yellow", 9, false, false, false);
        ball5.display();

        WaterBall ball6 = new WaterBall("Latex", "Purple", 11, true, false, true);
        ball6.display();

        WaterBall ball7 = new WaterBall("Vinyl", "Orange", 14, true, true, true);
        ball7.display();
		
		Gun gun1 = new Gun("Glock 19", "9mm", 15, false, true, true);
        gun1.display();

        Gun gun2 = new Gun("AK-47", "7.62mm", 30, true, false, true);
        gun2.display();

        Gun gun3 = new Gun("M16", "5.56mm", 30, true, true, false);
        gun3.display();

        Gun gun4 = new Gun("Desert Eagle", ".50 AE", 7, false, true, true);
        gun4.display();

        Gun gun5 = new Gun("MP5", "9mm", 25, true, true, true);
        gun5.display();

        Gun gun6 = new Gun("Colt 1911", ".45 ACP", 8, false, true, false);
        gun6.display();

        Gun gun7 = new Gun("Sniper Rifle", ".308", 10, false, true, false);
        gun7.display();
		
		NailPolish polish1 = new NailPolish("Lakme", "Red", 10, true, true, true);
        polish1.display();

        NailPolish polish2 = new NailPolish("Maybelline", "Pink", 12, true, false, true);
        polish2.display();

        NailPolish polish3 = new NailPolish("Revlon", "Blue", 8, false, true, true);
        polish3.display();

        NailPolish polish4 = new NailPolish("Elle 18", "Black", 10, true, true, false);
        polish4.display();

        NailPolish polish5 = new NailPolish("Colorbar", "Purple", 15, true, false, true);
        polish5.display();

        NailPolish polish6 = new NailPolish("Nykaa", "Orange", 10, false, true, true);
        polish6.display();

        NailPolish polish7 = new NailPolish("Sally Hansen", "Green", 14, true, true, true);
        polish7.display(); 
		
		Water water1 = new Water("Spring", "Liquid", 15, true, true, true);
        water1.display();

        Water water2 = new Water("River", "Liquid", 20, false, false, true);
        water2.display();

        Water water3 = new Water("Glacier", "Solid", -5, true, true, false);
        water3.display();

        Water water4 = new Water("Tap", "Liquid", 25, false, true, false);
        water4.display();

        Water water5 = new Water("Sea", "Liquid", 22, false, false, true);
        water5.display();

        Water water6 = new Water("Well", "Liquid", 18, true, true, true);
        water6.display();

        Water water7 = new Water("Rain", "Liquid", 10, true, true, false);
        water7.display();
	}
}