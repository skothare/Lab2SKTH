package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck  {
	
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public Card drawCard()
	{
		return DeckCards.remove(0);
		
	}
	public Deck()
	{
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()){
			for (eRank eRank : eRank.values())
			{
				DeckCards.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		
		Collections.shuffle(DeckCards);
		
		
	}
	private int GetDeckSize()
	{
		return DeckCards.size();	
	}
}
