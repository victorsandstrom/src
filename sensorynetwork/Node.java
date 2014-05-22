package sensorynetwork;
import java.util.*;

public class Node {

	
	/*
	 * Två attribut för att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" för att representera meddelanden
	 */
	
	private Request activeMessage = new Request();
	private LinkedList messageQueue = new LinkedList();
	private Position pos;
	/*
	 * TODO hashMap
	 */
	private HashMap eventTable = new HashMap(); 
	/*
	 * 
	 */
	private Hashtable neighbors = new Hashtable(); 
	
	public Node(int x, int y){
		//Check own position, use position class 
		pos.x = x;
		pos.y = y;	
		//Check Neighbors
		neighbours = checkNeighbors();
		
	}
	
	/* Funktion: Move()
	 * 1. Meddelande tas emot, meddelande sätts in i activeMessage 
	 * 2. Om activeMessage är "null" så stoppas nya meddelanden in i kön messageQueue eller
	 * så skickas det aktiva meddelandet vidare
	 */
	private void Move(){
		
	}
	
	/*
	 * Funktion: CheckNeighbors
	 * Retur: Returnerar en hashtabell med de grannar som omger noden i fråga
	 */
	private void CheckNeighbors(){
		/* Hashtable where the keys are the directions by compass notation from node 
		 * and value is position of node. 
		 */
		
		Hashtable table = new Hashtable();
		Position temp = new Position();
		
		/*
		 * TODO if-statement or switch-case to assign neighbors or other?
		 * Note: Remember special case if node is in corner or edge
		 */
	
		table.put("northW", temp);
		table.put("north", temp);
		table.put("northE", temp);
		//etc... 
	}

}
