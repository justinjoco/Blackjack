package blackjack;

import java.util.Scanner;

public class Hand {
	private static Scanner scan;
	private Card[]hand;
	private int numCards, count;
	
	private String option;
	
	String name;
	
	Hand(String name){
		this.name=name;
		hand=new Card [52];
		numCards=0;
		
	}
	
	
	
	public String getName(){
		return name;
		
	}
	
	public void addCard(Card newCard){
		hand[numCards]=newCard;
		numCards++;
	}
	
	public int getNumCards(){
		return numCards;
		
	}
	
	

	public void getCardvalue(){
	}

	
	public void displayHand(){
	System.out.println(getName());
	for (count=0; count<numCards;count++){
		System.out.print(hand[count].toString()+ " || ");
	}
	System.out.println();
	}
	
	
	
	public int totalHand(){
		int total = 0;
		int temp =0;
		for (count=0; count<numCards;count++){
			temp =hand[count].getIndexToValue();
			if (temp==1){
				temp=11;
				if ((total+temp)>21){
					temp=1;
				}
			}

			
			total+=temp;
		}
		
		return total;
		
	}
	

	public boolean split(Deck deck){
		
		scan = new Scanner(System.in);
		Card temp;
		loop: while (totalHand()<21){
			
			System.out.println(getName()+" "+totalHand());
			System.out.println("");
			System.out.println("Hit or stay? H/S");
			String answer = scan.nextLine();
			
			switch(answer){
			
			//HIT
			case "H":
				temp = deck.dealCard();
				System.out.println("HUMAN decides to HIT : "+temp.toString());
				addCard(temp);	
				break;
			//STAND
			case "S":
				System.out.println("HUMAN decides to STAY");
				break loop;
			
			//SPLIT
			case "SP":
				System.out.println("Splitting more than once is restricted");
				break;
			//DOUBLE DOWN
			case "DD":
				
				System.out.println("Double downing on splits is restricted");
				break;
		
				
				
				
			//NONE OF ABOVE
			default: System.out.println("Invalid input. Please pick H/S/SP/DD");
			}
			
			}
			
			if (totalHand()>21){
				System.out.println(getName()+" has busted");
				return false;
			}
			
			else{
				
				System.out.println(getName()+ " : " +totalHand());
				return true;
		
		}
		
	}

}
