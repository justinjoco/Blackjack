package blackjack;
import java.util.Scanner;

public class Blackjack {
	
	private static Scanner scan;
	
	
	public double playGame(Hand human, Hand computer, Deck deck, double bet, double totalMoney){
		scan = new Scanner (System.in);
		int humanHand =0;
		int computerHand=0;
		boolean isPair;
		Card upCard, humanCard1, humanCard2;
		
		humanCard1=deck.dealCard();
		human.addCard(humanCard1);
		computer.addCard(deck.dealCard());
		humanCard2=deck.dealCard();
		human.addCard(humanCard2);
		isPair = humanCard1.getIndex() ==humanCard2.getIndex();
		upCard = deck.dealCard();
		computer.addCard(upCard);
		
		human.displayHand();
		
		//SHOWS UPCARD
		System.out.println("\nCOMPUTER UPCARD: "+upCard.toString());
		
	//COMPUTER GET BLACKAJCK
		if (computer.totalHand()==21){
			System.out.println("Computer got blackjack");
			if (human.totalHand()==21){
				System.out.println("Human got blackjack");
				return bet;
			}else{
				System.out.println("Human did not get blackjack. Human loses");
				return 0-bet;
			}
		}
	
		
	//PLAYER GETS BLACKAJCK
	if (human.totalHand()==21){
		System.out.println("Human got blackjack. Human wins!");	
		return bet*1.5;
	}

	Card temp;
	loop: while (human.totalHand()<21){
		
		System.out.println("HUMAN: "+human.totalHand());
		System.out.println("");
		System.out.println("Hit,stay, split, or double down? H/S/SP/DD");
		String answer = scan.nextLine();
		
		switch(answer){
		
		//HIT
		case "H":
			temp = deck.dealCard();
			System.out.println("HUMAN decides to HIT : "+temp.toString());
			human.addCard(temp);	
			break;
		//STAND
		case "S":
			System.out.println("HUMAN decides to STAY");
			break loop;
		
		//SPLIT (WORK IN PROGRESS)
		case "SP":
			if (isPair==false|| (bet*2<totalMoney)){
			System.out.println("HUMAN cannot split because the first two cards are not pairs or double your bet exceeds total money");
			break;
			}
			else {
				System.out.println("HUMAN decides to SPLIT");
				Hand newHand1 = new Hand("Human Hand 1");
				Hand newHand2 = new Hand("Human Hand 2");
				newHand1.addCard(humanCard1);
				newHand2.addCard(humanCard2);
				newHand1.addCard(deck.dealCard());
				newHand2.addCard(deck.dealCard());
				if (newHand1.split(deck) == false || newHand2.split(deck)== false){
					return 0-(2*bet);
				}
				break loop;
				
				
			}
			
		//DOUBLE DOWN
		case "DD":
			if ((bet*2)<=totalMoney){
			temp = deck.dealCard();
			System.out.println("HUMAN decides to DOUBLE DOWN : "+temp.toString());
			human.addCard(temp);
			bet *=2;
			break loop;
			
			}else{
				System.out.println("HUMAN cannot DOUBLE DOWN because doubled bet exceeds total money.");
				break;
			}
			
		
			
		//NONE OF ABOVE
		default:System.out.println("Invalid input. Please pick H/S/SP/DD");
		}
		

	}
	
	//PLAYER BUSTS
	if (human.totalHand()>21){
		System.out.println("Human has busted");
		return 0-bet;
	}
	
	else{
		
		System.out.println("HUMAN: "+human.totalHand());
	}
	
	computer.displayHand();
	
	while (computer.totalHand()<human.totalHand()){
		System.out.println("COMPUTER: "+computer.totalHand());
		temp = deck.dealCard();
		System.out.println("COMPUTER has drawn "+ temp.toString());
		computer.addCard(temp);	
	}
	
	if (computer.totalHand()>21){
		System.out.println("Computer has busted");
		return bet;
	}
	

	System.out.println("COMPUTER: "+computer.totalHand());
	
	humanHand=21-human.totalHand();
	computerHand=21-computer.totalHand();
	
	
	
	if (humanHand<computerHand){
		return bet;
		
	}
	
	else if (humanHand==computerHand){
		return 0;
		
	}
	
	else{
		return 0-bet;
		
	}
	
	
	
		
		
	}
}
