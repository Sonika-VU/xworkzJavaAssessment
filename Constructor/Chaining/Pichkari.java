class Pichkari {
	String color;
	double price;
	int length;
	char size;
	String purchasedFrom;
	String shape;
	
	public Pichkari () {
		
	}
	
	public Pichkari (String color){
		this.color = color;
	}
	
	public Pichkari (String color , double price){
		this(color);
		this.price = price;
	}
	
	public Pichkari (String color , double price, int length){
		this(color, price);
		this.length = length;
	}
	
	public Pichkari (String color, double price, int length, char size){
		this(color, price, length);
		this.size =size;
	}
	
	public Pichkari (String color, double price, int length, char size, String purchasedFrom){
		this(color, price, length, size);
		this.purchasedFrom =purchasedFrom;
	}
	
	public Pichkari (String color, double price, int length, char size, String purchasedFrom, String shape){
		this(color, price, length, size, purchasedFrom);
		this.shape =shape;
	}
	
	public void display (){
		System.out.println("Color : " +this.color);
		System.out.println("Price : "+this.price);
		System.out.println("Length : "+this.length);
		System.out.println("Size : "+this.size);
		System.out.println("Purchased from : "+this.purchasedFrom);
		System.out.println("Shape : " + this.shape);
				System.out.println("=============================");

	}
	
}