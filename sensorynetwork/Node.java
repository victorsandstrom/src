package sensorynetwork;
import java.util.*;

public class Node {

	
	/*
	 * Tv� attribut f�r att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" f�r att representera meddelanden
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
	 * 1. Meddelande tas emot, meddelande s�tts in i activeMessage 
	 * 2. Om activeMessage �r "null" s� stoppas nya meddelanden in i k�n messageQueue eller
	 * s� skickas det aktiva meddelandet vidare
	 */
	private void Move(){
		
	}
	
	/*
	 * Funktion: CheckNeighbors
	 * Retur: Returnerar en hashtabell med de grannar som omger noden i fr�ga
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
