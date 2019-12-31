import java.util.Scanner;
public class Vacation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What kind of trip would you like to go on, musical,tropical, or adventurous?");
		
		String vacationType = scan.nextLine();
		System.out.println("Vacation is: " + vacationType);
		
		String number = scan.nextLine();
		int groupSize = Integer.parseInt(number);
				
		System.out.println("How many are in your group");
		System.out.println("Group size is: " + groupSize);
	
		if (groupSize <=2) {
			String travelSuggestion = "First Class";
		} else if (groupSize >= 5) {
			String travelSuggestion = "Helicopter";
		} else if (groupSize >= 6) {
			String travelSuggestion = "Charter Flight";
		}
		String vacationType1 = "musical";
		int groupSize1 = 1;
		String travelSuggestion = "Helicopter ";
		String destination = "New Orleans";
		if (vacationType1.equals("musical")) {
			travelSuggestion = " New Orleans ";
		} else if (vacationType1.equals("tropical")) {
			travelSuggestion = "Beach Vacation in Mexico ";
		} else if (vacationType1.contentEquals("adventurous")) {
			travelSuggestion = "Whitewater Rafting ";
		}			
		System.out.println("Since you're a group of: " + groupSize + "going on a" + vacationType1 + ", you should take" +
		travelSuggestion + "to" + destination);
		char[] result;
		System.out.println(result);
		
	}
	