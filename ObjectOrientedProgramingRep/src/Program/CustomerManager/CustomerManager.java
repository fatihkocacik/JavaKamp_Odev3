package Program.CustomerManager;



public class CustomerManager {
	
	private Customer _customer;
	private ICustomerManager _customerManager;
	
	public CustomerManager (Customer customer, ICustomerManager customerManager) {
		
		_customerManager = customerManager;
		_customer = customer;
		
	}
	
	public void save() {
		System.out.println("Müşteri ID: " + _customer.id);
		_customerManager.save();
	}
	
	
}
