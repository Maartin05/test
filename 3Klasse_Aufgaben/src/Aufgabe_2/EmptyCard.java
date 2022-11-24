package Aufgabe_2;

public class EmptyCard extends Card {
	@Override
	public String toString() {
		
		return "E" + super.toString();
	}
	
	public void ausgabe()
	{
		System.out.print("E");
	}
}
