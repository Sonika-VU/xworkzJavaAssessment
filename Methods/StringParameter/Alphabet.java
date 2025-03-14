class Alphabet{
	
	public static void printInAscending(char[] alpha){
		System.out.println("Printing alphabets in ascending order :");
		for(int i=0; i<alpha.length; i++){
			for(int j=i+1; j<alpha.length; j++){
				if(alpha[i] > alpha[j]){
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
			
		}
		
		for(char letter : alpha){
			System.out.print(letter + " ");
			
		}
		System.out.println();
	}
}