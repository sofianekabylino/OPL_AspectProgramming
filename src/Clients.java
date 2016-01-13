import java.util.LinkedList;
import java.util.List;

public class Clients {

	private List<Client> listClient = new LinkedList<Client>();

	/**
	 * @return the listClient
	 */
	public List<Client> getListClient() {
		return listClient;
	}

	public void addClient(Client c){
		listClient.add(c);
	}
	
	public void delClient(Client c){
		listClient.remove(c);
//		if(c.getClientOrders().isEmpty()){
//			listClient.remove(c);
//		}
//		else System.err.println("The client "+c.getName()+" has orders in his list");
	}
	
}