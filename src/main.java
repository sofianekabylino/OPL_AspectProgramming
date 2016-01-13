
public class main {

	public static void main(String[] args) {

		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		Client c4 = new Client();
		
		Order o1 = new Order();
		o1.setId(1);
		Order o2 = new Order();
		o2.setId(2);
		Order o3 = new Order();
		o3.setId(3);
		Order o4 = new Order();
		o4.setId(4);
		Order o5 = new Order();
		o5.setId(5);
		Order o6 = new Order();
		o6.setId(6);
		Order o7 = new Order();
		o7.setId(7);
		Order o8 = new Order();
		o8.setId(8);
		Order o9 = new Order();
		o9.setId(10);
		
		c1.setName("Sofiane");
		c1.addOrder(o9);
		c1.addOrder(o6);
		c2.setName("Slimane");
		c2.addOrder(o2);
		c2.addOrder(o3);
		c3.setName("Salla");
		c3.addOrder(o7);
		c3.addOrder(o1);
		c3.addOrder(o8);
		c4.setName("Dieulin");
		c4.addOrder(o4);
		c4.addOrder(o5);
		
		Orders orders = new Orders();
		orders.addOrder(o1);
		orders.addOrder(o2);
		orders.addOrder(o3);
		orders.addOrder(o4);
		orders.addOrder(o5);
		orders.addOrder(o6);
		orders.addOrder(o7);
		orders.addOrder(o8);
		orders.addOrder(o9);
		
		Clients clients = new Clients();
		clients.addClient(c1);
		clients.addClient(c2);
		clients.addClient(c3);
		clients.addClient(c4);
		
		for(int i = 0; i < clients.getListClient().size(); i++){
			System.out.println("Nom : "+clients.getListClient().get(i).getName()+"\nOrders : ");
			for(int j=0; j<clients.getListClient().get(i).getClientOrders().size(); j++){
				System.out.println(clients.getListClient().get(i).getClientOrders().get(j).getId());
				
			}
		}
	}

}
