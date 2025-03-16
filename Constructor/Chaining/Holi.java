class Holi {
	String location;
	int date;
	String day;
	int noOfPeople;
	boolean isDJ;
	boolean hasFun;
	
	public Holi(){
		
	}
	
	public Holi (String location){
		this.location = location;
	}
	
	public Holi(String location, int date){
		this(location);
		this.date = date;
	}
	
	public Holi (String location, int date, String day){
		this (location, date);
		this.day = day;
	}
	
	public Holi (String location, int date , String day, int noOfPeople){
		this(location, date, day);
		this.noOfPeople = noOfPeople;
	}
	
	public Holi (String location, int date, String day, int noOfPeople, boolean isDJ){
		this(location, date, day, noOfPeople);
		this.isDJ = isDJ;
	}
	public Holi (String location, int date, String day, int noOfPeople, boolean isDJ, boolean hasFun){
		this(location, date, day, noOfPeople, isDJ);
		this.hasFun = hasFun;
	}
	
	public void display(){
		System.out.println("Location : "+this.location);
		System.out.println("Date : "+ this.date);
		System.out.println("Day : "+this.day);
		System.out.println("No of people : "+this.noOfPeople);
		System.out.println("isDJ : "+this.isDJ);
		System.out.println("hasFun : "+this.hasFun);
		System.out.println("=============================");
	}
}