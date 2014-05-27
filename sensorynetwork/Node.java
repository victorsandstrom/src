import java.util.*;

public class Node {


	/*
	 * Två attribut för att hantera meddelanden under varje timeTick
	 * TODO Skapa en klass "Request" för att representera meddelanden
	 * activeMessage används av move och sendMessage för att besluta
	 * om ett meddelande kan skickas vidare under ett timeTick
	 */

	private boolean busy = false;
	private LinkedList<Agent> agentQueue = new LinkedList<Agent>();
	private LinkedList<Request> messageQueue = new LinkedList<Request>();
	private Position pos;
	private Network nw;
	/*
	 * TODO hashMap
	 */
	private HashMap<Integer,EventInfo> eventTable = new HashMap<Integer,EventInfo>();
	/*
	 *
	 */
	public Position getPos(){
		return pos;
	}

	public HashMap<Integer,EventInfo> getHashmap(){
		return eventTable;
	}
	Node(int x, int y,Network network){
		//Check own position, use position class
		nw = new Network();
		pos = new Position(x,y);
		nw = network;
		getNeighbours();

	}

	public boolean checkBusy(){
		return busy;
	}

	public void setBusyOn(){
		busy = true;
	}

	public void setBusyOff(){
		busy = false;
	}

	public boolean request(Object E){
		if (busy){
			messageQueue.add(E);
		}
		else if(!busy && messageQueue.isEmpty()){
			return true;
		}
		return false;
	}

/*//Funkar endast för Request! Inte för Agent.
	public boolean messageRequest(Request E,int id){
		if (!busy && messageQueue.isEmpty() && agentQueue.isEmpty()){
			if (eventTable.containsKey(id)){
				busy = false;
				return true;
			}
		}
		else{
			messageQueue.add(E);
		}
		return false;
	}
*/

	/* Funktion: Move()
	 * 1. Meddelande tas emot, meddelande sätts in i activeMessage
	 * 2. Om activeMessage är "null" så stoppas nya meddelanden in i kön messageQueue eller
	 * så skickas det aktiva meddelandet vidare
	 */
	public void move(){
		/*
		 * TODO check if activeMessage is true. If it is set it to false. If it isnt
		 * then check messageQueue, if there is a message there
		 */

		/*
		 * Om du använder 2 olike sorters kö.
		 *
		 * */
		if (busy == false){
			if(agentQueue.peek() != null){
				agentQueue.peek().update();
				agentQueue.peek().move();
				busy = true;
			}
			else if(messageQueue.peek() != null){
				messageQueue.peek().move();
				busy = true;
			}
		}

		if(!busy){
			messageQueue.peek().
		}
	}

	/*
	 * Funktion: CheckNeighbors
	 * Retur: Returnerar en hashtabell med de grannar som omger noden i fråga
	 */
	public ArrayList<Node> getNeighbours(){
		return pos.getNeighbors(this, nw.getArray());
	}


}
