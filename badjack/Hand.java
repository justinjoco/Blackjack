package badjack;

import java.util.Scanner;

public class Hand {
	
	static int counter=0;

	private static Scanner scan;
	
	public static int yourHand(){
		
		int total = 0;
		
		total+=Badjack.number();
		total+=Badjack.number();
		
		
	while (total <21){
		System.out.println("Your total is "+total);
		System.out.println("HIT or STAY?");
		scan = new Scanner(System.in);
		String answer =scan.nextLine();
	
		
		if (answer.equals("HIT")){
			total+=Badjack.number();
			
		}
		else if (answer.equals("STAY")){
			break;
			
		}
		else{
			System.out.println("Not valid answer");
			
		}
		
		
	}
	
	System.out.println("Your total is "+total);
		if (total==21){
			System.out.println("You got blackjack!");	
		}
		
		if (total>21){
			System.out.println("You busted!");	
			return 0;
		}
		
		return total;
	}
	
	
	
public static int compHand(){
		System.out.println("\nIt's the computer's turn! ");
		int total = 0;
		
		total+=Badjack.number();
		total+=Badjack.number();
		
		
	while (total <21){
		System.out.println("Comp total is "+total);
		if (total<=16){
		System.out.println("The computer hits!");
		
		total+=Badjack.number();
			
		}
		
		else{
			System.out.println("The computer stays!");
			break;
		}
		
		
	}
	
	System.out.println("Comp total is "+total);
		if (total==21){
			System.out.println("Comp got blackjack!");	
		}
		
		if (total>21){
			System.out.println("Comp busted!");	
			return 0;
		}
		
		return total;
		
	}
	
	
	
}
