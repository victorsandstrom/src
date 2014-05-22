package sensorynetwork;
import java.util.*;



public class Node {

	
	/*
	 * Två attribut för att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" för att representera meddelanden
	 */
	
	Request activeMessage = new Request();
	LinkedList messageQueue = new LinkedList(); 
	
	public Node(){
		//Check own position
		//Check Neighbours
		
	}
	
	/* Funktion: Move()
	 * 1. Meddelande tas emot, meddelande sätts in i activeMessage 
	 * 2. Om activeMessage är "null" så stoppas nya meddelanden in i kön messageQueue eller
	 * så skickas det aktiva meddelandet vidare
	 */
	private void Move(){
		
	}
	
	
	
}
