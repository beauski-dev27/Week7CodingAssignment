package week6FinalProject;

public class Card {
	private int value;
	private String name;
	
	
	public Card(int newValue, String suit) {
		
		value = newValue;
		
		switch(newValue) {
		case 2: suit = "2";
			break;
		case 3: suit = "3";
			break;
		case 4: suit = "4";
			break;
		case 5: suit = "5";
			break;
		case 6: suit = "6";
			break;
		case 7: suit = "7";
			break;
		case 8: suit = "8";
			break;
		case 9: suit = "9";
			break;
		case 10: suit = "10";
			break;
		case 11: suit = "Jack";
			break;
		case 12: suit = "Queen";
			break;
		case 13: suit = "King";
			break;
		case 14: suit = "Ace";
			break;
		}
		
		name += "of " + suit;
	} 
		
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(this.toString() + "\n");
	}
	
	
} // end of Class
