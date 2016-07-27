package badjack;

import java.util.Scanner;
public class Bets {

	private static Scanner scan;
	private static double bet;
	Bets(){
		
	}
	
	public static double placeBet(){
		System.out.println("How much do you want to bet?");
		scan = new Scanner(System.in);
		bet = Double.parseDouble(scan.nextLine());
		return bet;
	}
	
}
