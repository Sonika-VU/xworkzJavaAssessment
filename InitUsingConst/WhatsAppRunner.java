class WhatsAppRunner {
	
	public static void main(String[] args){
		
		WhatsApp whatsApp1 = new WhatsApp("Tejuka", "Send notes",12);
		WhatsApp whatsApp2 = new WhatsApp("Nanna", "How are you ? ",10);
		WhatsApp whatsApp3 = new WhatsApp("Amma", "Had breakfast",8);
		WhatsApp whatsApp4 = new WhatsApp("Frd", "Congragulations",6);
		WhatsApp whatsApp5 = new WhatsApp("Sinchana", "All teh best",15);
		
		System.out.println("whatsApp1 contact : "+whatsApp1.contact);
		System.out.println("whatsApp1 message : "+whatsApp1.message);
		System.out.println("whatsApp1 time : "+whatsApp1.time);
		
		System.out.println("=========================");
		
		System.out.println("whatsApp2 contact : "+whatsApp2.contact);
		System.out.println("whatsApp2 message : "+whatsApp2.message);
		System.out.println("whatsApp2 time : "+whatsApp2.time);
		
		System.out.println("=========================");
		
		System.out.println("whatsApp3 contact : "+whatsApp3.contact);
		System.out.println("whatsApp3 message : "+whatsApp3.message);
		System.out.println("whatsApp3 time : "+whatsApp3.time);
		
		System.out.println("=========================");
		
		System.out.println("whatsApp4 contact : "+whatsApp4.contact);
		System.out.println("whatsApp4 message : "+whatsApp4.message);
		System.out.println("whatsApp4 time : "+whatsApp4.time);
		
		System.out.println("=========================");
		
		System.out.println("whatsApp5 contact : "+whatsApp5.contact);
		System.out.println("whatsApp5 message : "+whatsApp5.message);
		System.out.println("whatsApp5 time : "+whatsApp5.time);
		
	}
}