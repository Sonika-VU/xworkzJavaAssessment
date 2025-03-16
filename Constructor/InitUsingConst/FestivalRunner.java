class FestivalRunner {
	
	public static void main(String[] args){
	
	Festival festival1 = new Festival("Sankranti", 1, 14);
	Festival festival2 = new Festival("Shivaratri", 2, 26);
	Festival festival3 = new Festival("Holi", 3, 14);
	Festival festival4 = new Festival("Ugadi", 3, 30);
	Festival festival5 = new Festival("Dasara", 10, 30);
	
	
	System.out.println("festival1 name : " +festival1.name);
	System.out.println("festival1 month : " +festival1.month);
	System.out.println("festival1 date : " +festival1.date);
	
	System.out.println("=======================");
	
	System.out.println("festival2 name : " +festival2.name);
	System.out.println("festival2 month : " +festival2.month);
	System.out.println("festival2 date : " +festival2.date);
	
	System.out.println("=======================");
	
	System.out.println("festival3 name : " +festival3.name);
	System.out.println("festival3 month : " +festival3.month);
	System.out.println("festival3 date : " +festival3.date);
	
	System.out.println("=======================");
	
	System.out.println("festival4 name : " +festival4.name);
	System.out.println("festival4 month : " +festival4.month);
	System.out.println("festival4 date : " +festival4.date);
	
	System.out.println("=======================");
	
	System.out.println("festival5 name : " +festival5.name);
	System.out.println("festival5 month : " +festival5.month);
	System.out.println("festival5 date : " +festival5.date);
	}
	
}