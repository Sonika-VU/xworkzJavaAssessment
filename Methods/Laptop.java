public class Laptop{

		public static  void switchOn(){
			System.out.println("Switching on in laptop");
		}
		
		public static void switchOff(){
			System.out.println("Switching off in laptop");
		}
		
		public static void browseInternet(){
			System.out.println("Browsing internet in laptop");
		}
		
		public static void editDocument(){
			System.out.println("Edit document in laptop");
		}
		
		public static void playGame(){
			System.out.println("Playing game in laptop");
		}
		
		public static void createFolder(){
			System.out.println("Creating folder in laptop");
		}
		
		public static void runPrograms(){
			System.out.println("Running programs in laptop");
		}
		
		public static void createTextFile(){
			System.out.println("Creating text file in laptop");
		}
		
		public static void deleteFiles(){
			System.out.println("Deleting files in laptop");
		}
		
		public static void videoConference(){
			System.out.println("Attending video conference in laptop");
		}
		
		public static void main(String[] args){
			switchOn();
			switchOff();
			browseInternet();
			editDocument();
			playGame();
			
			MNCCompany.projectStatus();
			Icc.manageRecords();
			IplCup.announceNextIpl();
			Globe.showMap();
			Atom.showStructure();
		}
		
}