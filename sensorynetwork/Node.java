package sensorynetwork;
import java.util.*;



public class Node {

	
	/*
	 * Tv� attribut f�r att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" f�r att representera meddelanden
	 */
	
	Request activeMessage = new Request();
	LinkedList messageQueue = new LinkedList(); 
	
	public Node(){
		//Check own position
		//Check Neighbours
		
	}
	
	/* Funktion: Move()
	 * 1. Meddelande tas emot, meddelande s�tts in i activeMessage 
	 * 2. Om activeMessage �r "null" s� stoppas nya meddelanden in i k�n messageQueue eller
	 * s� skickas det aktiva meddelandet vidare
	 */
	private void Move(){
		
	}
	
	
	
}
