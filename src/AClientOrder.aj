import java.util.LinkedList;
import java.util.List;

public aspect AClientOrder {

	private List<Order> Client.clientOrders = new LinkedList<Order>();
	
	public boolean Client.hasOrder(){
		return (!clientOrders.isEmpty());
	}
	public void Client.addOrder(Order o){
		clientOrders.add(o);
	}
	public List<Order> Client.getClientOrders() {
		return clientOrders;
	}
	
	private Client Order.client;
	
	public Client Order.getClient() {
		return client;
	}
	
	public void Order.setClient(Client client) {
		if(client == null)
			client = client;
		else System.err.println("the order n° "+" is allocated to another client");
	}
	
	pointcut toBeTraced():
		call(void delClient(Client)) ||
		execution(* *.delClient(Client));
	
	void around():toBeTraced(){
		if(((Client)thisJoinPoint.getArgs()[0]).getClientOrders().isEmpty()){
			proceed();
		}
	}
	
}
