class HarpicRunner{
	
	public static void main(String [] args){
		
		Harpic harpic1 = new Harpic("Blue", 150, 50);
		Harpic harpic2 = new Harpic("Red", 500, 150);
		Harpic harpic3 = new Harpic("Blue", 500, 1000);
		Harpic harpic4 = new Harpic("Red", 150, 50);
		Harpic harpic5 = new Harpic("Blue", 200, 70);
		
		System.out.println("harpic1 color : "+harpic1.color);
		System.out.println("harpic1 price : "+harpic1.price);
		System.out.println("harpic1 volume : "+harpic1.volume);
		
		System.out.println("=======================");
		
		System.out.println("harpic2 color : "+harpic2.color);
		System.out.println("harpic2 price : "+harpic2.price);
		System.out.println("harpic2 volume : "+harpic2.volume);
		
		System.out.println("=======================");
		
		System.out.println("harpic3 color : "+harpic3.color);
		System.out.println("harpic3 price : "+harpic3.price);
		System.out.println("harpic3 volume : "+harpic3.volume);
		
		System.out.println("=======================");
		
		System.out.println("harpic4 color : "+harpic4.color);
		System.out.println("harpic4 price : "+harpic4.price);
		System.out.println("harpic4 volume : "+harpic4.volume);
		
		System.out.println("=======================");
		
		System.out.println("harpic5 color : "+harpic5.color);
		System.out.println("harpic5 price : "+harpic5.price);
		System.out.println("harpic5 volume : "+harpic5.volume);
				
	}
}