class Task{
	
	public static String getNameFromMobile(int mNo){
		System.out.println("The mobile no. : "+mNo);

		if(mNo == 987654){
			return "Sara";
		}
		else if(mNo == 398067){
			return "Tanu";
		}
		else if(mNo == 267900){
			return "Ramya";
		}
		else if(mNo == 678959){
			return "Varun";
		}
		else if(mNo == 546979){
			return "Gani";
		}
		else if(mNo == 739398){
			return "Sowmya";
		}
		else if(mNo == 576893){
			return "Umu";
		}
		else if(mNo == 978790){
			return "Honey";
		}
		else if(mNo == 4680876){
			return "Roopa";
		}
		else if(mNo == 578934){
			return "Teju";
		}//10
		else if(mNo == 387978){
			return "Bhanu";
		}
		else if(mNo == 387007){
			return "Priya";
		}
		else if(mNo == 690970){
			return "Lavanya";
		}
		else if(mNo == 609059){
			return "Pallavi";
		}
		else if(mNo == 568790){
			return "Nitya";
		}
		else if(mNo == 587806){
			return "Hema" ;
		}
		else if(mNo == 357690){
			return "Sanjana";
		}
		else if(mNo == 619383){
			return "Geeta";
		}
		else if(mNo == 123455){
			return "Sannidi";
		}
		else if (mNo == 367291){
			return "Sinchana";
		}
		else if(mNo == 231909){
			return "Vinay";
		}
		else if(mNo == 879202){
			return "Nikhil";
		}
		else if(mNo == 234708){
			return "Vishnu";
		}
		return "Not found";
	}
	
	public static String getOwnerFromCompany(String company){
		System.out.println("The company is : " + company);
		if(company == "SLK"){
			return "Parth Amin";
		}
		else if(company ==  "Apple"){
			return "Tim Cook";
		}
		else if(company == "Microsoft"){
			return "Satya Nadella";
		}
		else if(company == "Amazon"){
			return "Andy Jassy";
		}
		else if(company == "Tesla"){
			return "Elon Musk"; 
		}
		else if(company == "Google"){
			return "Sundar Pichai";
		}
		else if(company == "Facebook"){
			return "Mark Zuckerberg";
		}
		else if (company == "Reliance"){
			return "Mukesh Ambani";
		}
		else if(company == "Instagram"){
			return "Mark Zuckerberg";
		}
		else if(company == "Tata" ){
			return "Chandrasekaran";
		}
		else if (company == "Wipro"){
			return "azim Premji";
		}
		else if(company == "Adobe"){
			return "Shantanu Narayen";
		}
		else 
			return "Not found";
	}
	
	public static double getPriceFromFood(String food){
		System.out.println("The item is : "+ food);
		if(food == "dosa"){
			return 90;
		}
		else if(food == "idli"){
			return 70;
		}
		else if(food == "Poori"){
			return 50;
		}
		else if(food == "pulav"){
			return 40;
		}
		else if(food == "Chicken Biriyani"){
			return 210;
		}
		else if(food == "Muton Biriyani"){
			return 270;
		}
		else if(food == "Chicken gravy"){
			return 250;
		}
		else if(food == "Kabab"){
			return 100;
		}
		else if(food == "Upma"){
			return 60;
		}
		else if (food == "Chitranna"){
			return 30;
		}
		else if(food == "Chapathi"){
			return 70;
		}
		else if(food == "Egg burg"){  //12
			return 50;
		}
		else if(food == "Leg soup"){
			return 300;
		}
		else if(food == "Panneer rice"){
			return 80;
		}
		else if(food == "fried rice"){
			return 60;
		}
		else if(food == "Baby corn manchurian"){
			return 150;
		}
		else if(food == "Shezwan Rice"){
			return 180;
		}
		else if(food == "Fish fry"){
			return 230;
		}
		else if (food == "Boti fry"){
			return 300;
		}
		else 
			return 0;
	}
	
	public static double getBalanceFromAcc(int acNo){
		System.out.println("The acNo is : "+acNo);
		
		if(acNo == 124353){
			return 23000;
		}
		else if(acNo == 344565){
			return 23000;
		}
		else if(acNo == 564634){
			return 98000;
		}
		else if(acNo == 397567){
			return 897700;
		}
		else if(acNo == 873459){ //5
			return 45000;
		}
		else if(acNo == 467897){
			return 100000;
		}
		
		else if(acNo == 324789){
			return 67000;
		}
		else if(acNo == 234905){
			return 9;
		}
		else if (acNo == 892347){
			return 79006;
		}
		else if(acNo == 768905){   //10
			return 60;
		}
		else if(acNo == 385212){
			return 32423;
		}
		else if(acNo == 123546){
			return 389279;
		}
		else if(acNo == 839729){
			return 38000;
		}
		else if(acNo == 299777){
			return 20000;
		}
		else if(acNo == 291093){   //15
			return 10000;
		}
		else if(acNo == 210098){
			return 122;
		}
		else if(acNo == 123908){
			return 40000;
		}
		else if(acNo == 234211){
			return 125;
		}
		else return 0;
	}
	
	public static double getPriceFromSource(String source){
		System.out.println("The source is : "+ source);
		if(source == "office"){
			return 90;
		}
		else if(source == "labor"){
			return 70;
		}
		else if(source == "begging"){
			return 50;
		}
		else if(source == "construct"){
			return 40;
		}
		else if(source == "hotel"){
			return 210;
		}
		else if(source == "resort"){
			return 270;
		}
		else if(source == "taylor"){
			return 250;
		}
		else if(source == "industry"){
			return 100;
		}
		else if(source == "manufacture"){
			return 60;
		}
		else if (source == "medicines"){
			return 30;
		}
		else if(source == "teaching"){
			return 70;
		}
		else if(source == "Typing"){  //12
			return 50;
		}
		else if(source == "Acting"){
			return 300;
		}
		else if(source == "Dancing"){
			return 80;
		}
		else if(source == "Singing"){
			return 60;
		}
		else if(source == "Stunt master"){
			return 150;
		}
		else if(source == "Photography"){
			return 180;
		}
		else if(source == "Drawing"){
			return 230;
		}
		else if (source == "Crochet"){
			return 300;
		}
		else if(source == "Marketing"){
			return 3244;
		}
		else 
			return 0;
	}
	
	public static boolean getAliveFromName(String name){
		System.out.println("The person name is : "+name);
		if(name == "Abdul Kalam"){
			return false;
		}
		
		else if(name == "Modi"){
			return true;
		}
		else if(name == "Ghandhi"){
			return false;
		}
		else if(name == "Murmu"){
			return true;
		}
		else if(name == "Siddramayya"){
			return true;
		}
		else if(name == "Allu arjun"){
			return true;
		}
		else if(name == "Genelia"){
			return true;
		}
		else if(name == "Remo"){
			return true;
		}
		else if(name == "pranab mukherjee"){
			return false;
		}
		return true;
		
	}
	
	
}