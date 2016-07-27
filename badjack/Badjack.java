package badjack;

import java.util.Random;
import java.util.Scanner;

public class Badjack {
	
	
	static int counter=0;
	
	
	public static int number(){
		int low = 1;
		int high = 12;
		Random r = new Random();
		int result =  r.nextInt(high-low)+low;
		System.out.println(result);
		return result;
	}
	
	
	public static boolean playGame (){
		counter++;
		int hand1=Hand.yourHand();
		
		if (hand1==0)
			return false;
		
		int hand2=Hand.compHand();
		
		if (hand2==0){
			return true;
		}
		
		int yourDiff=21-hand1;
		int compDiff = 21-hand2;
		if (yourDiff<compDiff){
		return true;
		}
		return false;
	}
	
	
}
