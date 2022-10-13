package Aufgabe_2;

public class Card {
	protected boolean visible;

	@Override
	public String toString() {
		return visible ? "_" : "*";
	}
}
