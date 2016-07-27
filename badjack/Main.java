package badjack;
import java.util.Scanner;


public class Main {

	private static Scanner scan;

	
	public static void main (String args[]){
		System.out.println("How much money do you have?");
		scan = new Scanner (System.in);
		double totalMoney = Double.parseDouble(scan.nextLine());
		double bet;
		while (true){
			if (totalMoney==0){
			System.out.println("You have no money to bet!");
				break;
			}
		System.out.println("Want to play Badjack? Y/N");
		scan = new Scanner(System.in);
		String answer =scan.nextLine();
		
		if (answer.equals("Y")){
		bet = Bets.placeBet();
		if (bet>totalMoney){
			
			System.out.println("Your bet has exceeded your total money. Please bet lower.");
			continue;
		}
		
		System.out.println("Game start!");
			if (Badjack.playGame()==false){
				System.out.println("You have lost this hand!\n");
				totalMoney-=bet;
			
			}else{
				System.out.println("You have won this hand!\n");
				totalMoney+=bet;
				
			}
	
		}
		
		else if (answer.equals("N")){
		System.out.println("Game end!");
			
		break;
		
		}else{
			System.out.println("Not valid answer! Use Y/N");
		}
		
		System.out.println("Your money is now "+ totalMoney);
		
		
		}
		
		System.out.println("Your total money is now "+ totalMoney);
		System.out.println("You have played "+ Badjack.counter+" time(s).");
		
	}
}
