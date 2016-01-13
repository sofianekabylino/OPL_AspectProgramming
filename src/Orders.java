import java.util.LinkedList;
import java.util.List;

public class Orders {

	private List<Order> listOrders = new LinkedList<Order>();
	
	public void addOrder(Order o){
		listOrders.add(o);
	}
	
	public void delOrder(Order o){
		listOrders.remove(o);
	}

	/**
	 * @return the listOrders
	 */
	public List<Order> getListOrders() {
		return listOrders;
	}
}
