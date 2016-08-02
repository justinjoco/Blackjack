package blackjack;
import java.util.Scanner;


public class Main {

	private static Scanner scan;
	
	
	public static void main(String[] args){
		scan = new Scanner (System.in);
		int numberofTimesPlayed=0;
		
		System.out.println("How much money do you have?");
		scan = new Scanner (System.in);
		double totalMoney = Double.parseDouble(scan.nextLine());
		double bet;
		//Deck size
			System.out.println("How many decks do you want?");
			int numDecks = Integer.parseInt(scan.nextLine());
			Deck deck = new Deck(numDecks);
		
			//Shuffle amount
			System.out.println("How many times do you want to shuffle?");
			int timesShuffled = Integer.parseInt(scan.nextLine());
			int index;
			for (index=0;index<timesShuffled;index++){
				deck.shuffle();
			}
			
		while (true){
			Blackjack blackjack = new Blackjack();
			
			if (totalMoney==0){
			System.out.println("You have no money to bet!");
				break;
			}
			
			
			//Play round of blackjack
			System.out.println("Want to play a round of Blackjack? Y/N");
			String answer =scan.nextLine();
			
			if (answer.equals("Y")){
				
				
			bet = Bets.placeBet();
			if (bet>totalMoney){
				
				System.out.println("Your bet has exceeded your total money. Please bet lower.");
				continue;
			}
			
			System.out.println("Round start!");
			
			Hand human = new Hand("HUMAN");
			Hand computer = new Hand("COMPUTER");
			double result = 0;	
			result = blackjack.playGame(human, computer, deck, bet, totalMoney);
			
				if (result<0){
					System.out.println("You have lost this hand!\n");
	
				
				}
				else if (result ==0){
				System.out.println("Both human and computer have same total. Nothing gained or lost.\n");
				}	
				
				else{
				System.out.println("You have won this hand!\n");
							
				}
				totalMoney+=result;
				numberofTimesPlayed++;
		
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
			System.out.println("You have played "+ numberofTimesPlayed+" round(s).");
			
		}	
	
		
		
		
		

	
	
	

}
