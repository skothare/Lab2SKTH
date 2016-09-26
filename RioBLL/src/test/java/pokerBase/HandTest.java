package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eCardNo;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class HandTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestRoyalFlush() {	
	}

	@Test
	public void TestFourOfAKind1() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.ACE,0));		
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.KING,0));
		Hand h = new Hand();	
		boolean bActualIsHandFourOfAKind = Hand.isHandFourOfAKind(h, hs);
		boolean bExpectedIsHandFourOfAKind = true;
		assertEquals(bActualIsHandFourOfAKind,bExpectedIsHandFourOfAKind);		
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.CLUBS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.KING);
	}
	

	@Test
	public void TestStraightFlush() {	
	}
	
}
