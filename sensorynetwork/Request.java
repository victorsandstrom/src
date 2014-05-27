
public class Request extends Agent {

	private int eventId;
	private boolean foundWay = false;

	Request(Node node, int id){
		super(node);
		eventId = id;
		//node.messageRequest(eventId);
	}

	public void move(){
		if(foundWay){
			path.push(currentNode);
			currentNode = currentNode.getHashmap().get(eventId);
			pos = currentNode.getPos();
		}
		else{
			super.move();
		}
		if (currentNode.request(this)){

		}
	}

	private void updateInfo(){
		if()
	}



}
