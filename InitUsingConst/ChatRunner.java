class ChatRunner {
	
	public static void main(String[] args){
		Chat chat1 = new Chat("Hello", "WhatsApp", 12);
		Chat chat2 = new Chat("Hii", "Instagram",3 );
		Chat chat3 = new Chat("Good morning", "Facebook", 8);
		Chat chat4 = new Chat("Good night", "SnapChat", 14);
		Chat chat5 = new Chat("New Information", "Twitter", 9);
		
		System.out.println("chat1 message : " + chat1.message);
		System.out.println("chat1 media : " +chat1.media);
		System.out.println("chat1 date : "+chat1.date);
		
		System.out.println("======================");
		
		System.out.println("chat2 message : " + chat2.message);
		System.out.println("chat2 media : " +chat2.media);
		System.out.println("chat2 date : "+chat2.date);
		
		System.out.println("======================");
		
		System.out.println("chat3 message : " + chat3.message);
		System.out.println("chat3 media : " +chat3.media);
		System.out.println("chat3 date : "+chat3.date);
		
		System.out.println("======================");
		
		System.out.println("chat4 message : " + chat4.message);
		System.out.println("chat4 media : " +chat4.media);
		System.out.println("chat4 date : "+chat4.date);
		
		System.out.println("======================");
		
		System.out.println("chat5 message : " + chat5.message);
		System.out.println("chat5 media : " +chat5.media);
		System.out.println("chat5 date : "+chat5.date);
		
	}
}