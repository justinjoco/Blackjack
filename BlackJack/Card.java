package blackjack;

public class Card {

	private int suit, index, value;
	
	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN= 12;
	private static final int KING= 13;
	

	
	private static final int Diamonds = 0;
	private static final int Hearts = 1;
	private static final int Clubs = 2;
	private static final int Spaids = 3;
	
	public Card(int suit, int index){
		this.suit=suit;	
		this.index=index;
	}
	
	public int getSuit(){
		
		return suit;
	}
	
	public int getIndex(){
		
		return index;
	}
	
	public String getSuitToString(){
		switch(suit){
			case Diamonds:
			return "Diamonds";
			case Hearts:
				return "Hearts";
			case Clubs:
				return "Clubs";
			case Spaids:
				return "Spaids";
			default:
				throw new IllegalArgumentException("Invalid entry: " + suit + " You can only choose between Diamonds, Hearts, Clubs, and Spaids");
		}
		
		
	}
	
	public String getIndexToString(){
		switch (index){
		case 1: return "ACE";
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return "5";
		case 6: return "6";
		case 7:return "7";
		case 8:return "8";
		case 9:return "9";
		case 10:return "10";
		case 11:return "JACK";
		case 12:return "QUEEN";
		case 13:return "KING";
		
		default:
			throw new IllegalArgumentException("Invalid entry: " + value + " You can only values bewteen 1 and 13, inclusive");
		}
		
	
		
	}
	
	public int getIndexToValue(){
		switch (index){
		case ACE: return 1;
		case 2: return 2;
		case 3: return 3;
		case 4: return 4;
		case 5: return 5;
		case 6: return  6;
		case 7:return 7;
		case 8:return 8;
		case 9:return 9;
		case 10:return 10;
		case JACK:return 10;
		case QUEEN:return 10;
		case KING:return 10; 
		default: return 0;
		
		}
		
	}
	
	
	public String toString(){
		
		
		return getIndexToString() + " of " + getSuitToString();
	}
	
}
