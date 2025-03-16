class MagnetRunner {
	
	public static void main(String[] args){
		Magnet magnet1 = new Magnet("Circle", 5,2);
		Magnet magnet2 = new Magnet("Oval", 3,1);
		Magnet magnet3 = new Magnet("Rectangle", 10,5);
		Magnet magnet4 = new Magnet("Star", 4,1);
		Magnet magnet5 = new Magnet("Triangle", 3,2);
		
		System.out.println("magnet1 shape : "+magnet1.shape);
		System.out.println("magnet1 length : "+magnet1.length);
		System.out.println("magnet1 noOfPieces : "+magnet1.noOfPieces);
		
		System.out.println("===========================");
		
		System.out.println("magnet2 shape : "+magnet2.shape);
		System.out.println("magnet2 length : "+magnet2.length);
		System.out.println("magnet2 noOfPieces : "+magnet2.noOfPieces);
		
		System.out.println("===========================");
		
		System.out.println("magnet3 shape : "+magnet3.shape);
		System.out.println("magnet3 length : "+magnet3.length);
		System.out.println("magnet3 noOfPieces : "+magnet3.noOfPieces);
		
		System.out.println("===========================");
		
		System.out.println("magnet4 shape : "+magnet4.shape);
		System.out.println("magnet4 length : "+magnet4.length);
		System.out.println("magnet4 noOfPieces : "+magnet4.noOfPieces);	

		System.out.println("===========================");
		
		System.out.println("magnet5 shape : "+magnet5.shape);
		System.out.println("magnet5 length : "+magnet5.length);
		System.out.println("magnet5 noOfPieces : "+magnet5.noOfPieces);	
		
		
	}
}