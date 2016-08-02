package blackjack;

public class Deck {

	private int index=0,jndex =0, hndex=0,
				suitNumber=4,
				cardsPerSuit=13,
				numCards=0,
				deckSize,
				cardsLeft;
	
	Card[] newDeck;

	
	Deck(int numDecks){
		deckSize = 52*numDecks;
		 newDeck = new Card[deckSize];
		 for (hndex=0;hndex<numDecks;hndex++){
		for (index=0;index<suitNumber;index++){
	
			for (jndex=1;jndex<=cardsPerSuit;jndex++){
				newDeck[numCards]=new Card(index, jndex);
				numCards++;
		}
	   }
		
		 }
		 
		 
		 cardsLeft=deckSize;
	}	
	
	

	public void shuffle(){
		
		for ( int i = deckSize-1; i >= 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = newDeck[i];
            newDeck[i] = newDeck[rand];
            newDeck[rand] = temp;
        }
		
	}
	
	public Card dealCard(){
		cardsLeft--;
		return newDeck[cardsLeft];
	}
	
	public void displayDeck(){
		int i;
		for (i=0;i<deckSize;i++){
			System.out.println(newDeck[i].toString());
		}
		
		
	}
	
}
