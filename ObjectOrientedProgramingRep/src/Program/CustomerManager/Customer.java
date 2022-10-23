package Program.CustomerManager;

public class Customer {

		public int id;
		public String Address;
		public String Phone;
		
		
		
		
		
		public Customer(int id, String address, String phone) {
			super();
			this.id = id;
			Address = address;
			Phone = phone;
			
			
			
			
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}
		
}
