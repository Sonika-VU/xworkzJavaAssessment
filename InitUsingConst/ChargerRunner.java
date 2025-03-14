class ChargerRunner {
	
	public static void main(String[] main){
		
		Charger charger1 = new Charger(60,150,"White");
		Charger charger2 = new Charger(80,180,"Black");
		Charger charger3 = new Charger(100,200,"Red");
		Charger charger4 = new Charger(60,150,"White");
		Charger charger5 = new Charger(70,170,"Black");
		
		System.out.println("charger1 volts : "+charger1.volts);
		System.out.println("charger1 price : "+charger1.price);
		System.out.println("charger1 color : "+charger1.color);
		
		System.out.println("=========================");
		
		System.out.println("charger2 volts : "+charger2.volts);
		System.out.println("charger2 price : "+charger2.price);
		System.out.println("charger2 color : "+charger2.color);
		
		System.out.println("=========================");
		
		System.out.println("charger3 volts : "+charger3.volts);
		System.out.println("charger3 price : "+charger3.price);
		System.out.println("charger3 color : "+charger3.color);
		
		System.out.println("=========================");
		
		System.out.println("charger4 volts : "+charger4.volts);
		System.out.println("charger4 price : "+charger4.price);
		System.out.println("charger4 color : "+charger4.color);
		
		System.out.println("=========================");
		
		System.out.println("charger5 volts : "+charger5.volts);
		System.out.println("charger5 price : "+charger5.price);
		System.out.println("charger5 color : "+charger5.color);
		
		System.out.println("=========================");
	}
}