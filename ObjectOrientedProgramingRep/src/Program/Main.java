package Program;

import Program.CreditManager.Manager;
import Program.CustomerManager.CommercialCustomer;
import Program.CustomerManager.Customer;
import Program.CustomerManager.CustomerManager;
import Program.CustomerManager.ICustomerManager;
//import Program.CustomerManager.Customer;
//import Program.CustomerManager.CustomerManager;
//import Program.CustomerManager.IndividualCustomer;
import Program.CustomerManager.IndividualCustomer;

public class Main {

	public static void main(String[] args) {
		Manager creditManager = new Manager();

		creditManager.calculate();
		
		CustomerManager customer1 = new CustomerManager(new Customer(152525, null, null), new CommercialCustomer(0, "Sıla Pastanesi", null, null, null));
		customer1.save();
		
		CustomerManager customer2 = new CustomerManager(new Customer(0, null, null), new IndividualCustomer(0, null, null, null, null, null, null, null));
		customer2.save();
	}
	
	
	
	
	
	
	
	

}
