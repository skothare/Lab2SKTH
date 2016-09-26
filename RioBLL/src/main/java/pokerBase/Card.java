package pokerBase;

import java.util.Comparator;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card implements Comparable {
	private int iCardNbr;
	private eSuit eSuit;
	private eRank eRank;
	public int getiCardNbr() {
		return iCardNbr;
	}

	public eSuit geteSuit(){
		return eSuit;
	}
	
	public eRank getRank(){
		return eRank;
	}
	public Card(pokerEnums.eSuit eSuit, pokerEnums.eRank eRank, int iCardNbr) {
		super();
		this.iCardNbr = iCardNbr;
		this.eSuit = eSuit;
		this.eRank = eRank;
	}
	public static Comparator<Card> CardRank = new Comparator<Card>() {

	public int compare(Card c1, Card c2){
		int Cno1 = c1.geteRank().getiRankNbr();
		int Cno2 = c2.geteRank().getiRankNbr();

		return Cno2 - Cno1;}};
		public int compareTo(Object o) {
			
		    Card c = (Card) o; 
		    return c.geteRank().compareTo(this.geteRank()); 
	}

		protected pokerEnums.eRank geteRank() {
			
			return null;
		}
}
