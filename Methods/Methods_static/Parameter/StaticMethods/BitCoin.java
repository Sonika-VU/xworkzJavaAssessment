class BitCoin{
	public static void checkBalance(){
		System.out.println("Running checkBalance in BitCoin");
		Currency.convert();
		Currency.cease();
	}
	
	public static void sendBitcoin(){
		System.out.println("Running sendBitcoin in BitCoin");
		//checkBalance();
		receiveBitcoin();
		
	}
	
	public static void receiveBitcoin(){
		System.out.println("Running receiveBitcoin in BitCoin");
		//sendBitcoin();
		checkBalance();
	}
	
	public static void checkPrice(){
		System.out.println("Running checkPrice in BitCoin");
		sendBitcoin();
	}
}