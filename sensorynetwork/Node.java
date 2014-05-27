package sensorynetwork;
import java.util.*;

public class Node {

	
	/*
	 * Tv� attribut f�r att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" f�r att representera meddelanden
	 * activeMessage anv�nds av move och sendMessage f�r att besluta
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
	 * 1. Meddelande tas emot, meddelande s�tts in i activeMessage 
	 * 2. Om activeMessage �r "null" s� stoppas nya meddelanden in i k�n messageQueue eller
	 * s� skickas det aktiva meddelandet vidare
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
	 * Retur: Returnerar en hashtabell med de grannar som omger noden i fr�ga
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
