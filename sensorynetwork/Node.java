package sensorynetwork;
import java.util.*;

public class Node {

	
	/*
	 * Två attribut för att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" för att representera meddelanden
	 * activeMessage används av move och sendMessage för att besluta
	 * om ett meddelande kan skickas vidare under ett timeTick
	 */
	private boolean activeMessage;
	private LinkedList messageQueue = new LinkedList();
	private int timeTick;
	private Position pos;
	//eventTable, direction and approximate distance
	private HashMap eventTable = new HashMap(); 
	private Hashtable neighborlist = new Hashtable();

	public Node(int x, int y){
		//Check own position, use position class 
		pos.x = x;
		pos.y = y;	
		//Check Neighbors
		neighborlist = CheckNeighbors();
		
	}
	
	/*
	 * The Update function makes sure all standard actions (eg. sending messages forward from 
	 * message queue, receiving messages and adding another timeTick to the nodes internal clock
	 * unless one has already been added. 
	 */
	
	public void update(int timeTick){
		timeTick = this.timeTick;
		Move();
	}
	
	public void updateInfo(HashMap eventTable){
		this.eventTable = eventTable;
	}
	
	/* Funktion: Move()
	 * 1. Meddelande tas emot, meddelande sätts in i activeMessage 
	 * 2. Om activeMessage är "null" så stoppas nya meddelanden in i kön messageQueue eller
	 * så skickas det aktiva meddelandet vidare
	 */
	private void move(){
		/*
		 * TODO check if activeMessage is true. If it is set it to false. If it isn't
		 * then check messageQueue, if there is a message there 
		 */
		if(activeMessage == true) {
			sendRequest(messageQueue.removeFirst()); 
			activeMessage = false;
		}
		
	}
	
	/*
	 * Funktion: CheckNeighbors
	 * Retur: Returnerar en hashtabell med de grannar som omger noden i fråga
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Hashtable checkNeighbors(){
		/* Hashtable where the keys are the directions by compass notation from node 
		 * and value is position of node. 
		 */		
		Hashtable neighborlist = new Hashtable();
		Position temp = new Position();
		
		/* TODO if-statement or switch-case to assign neighbors or other?
		 * Note: Remember special case if node is in corner or edge
		 */
	
		neighborlist.put("northW", temp);
		neighborlist.put("north", temp);
		neighborlist.put("northE", temp);
		//etc... 
		
		return this.neighborlist = neighborlist;
	}
	
	public void sendRequest(Object object){
		
	}
	
	public boolean request(){
		return activeMessage;
		
	}

}
