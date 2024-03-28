package week6FinalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	List<String> suits = Arrays.asList("Spades", "Hearts", "Diamonds", "Clubs");
	
	public Deck() {
		this.cards = new ArrayList<>();
		for(int i = 2; i < 15; i++) {
			for(String suit : suits) {
				cards.add(new Card(i, suit));
			}
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	public int size() {
		return cards.size();
		}
	
} // end of Class
