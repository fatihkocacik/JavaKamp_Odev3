package Program.CustomerManager;

public class IndividualCustomer extends Customer implements ICustomerManager {
	
	public void save() {
		System.out.println("");
		System.out.println("Kişiye Kredi Verildi, Kişi İsmi ; " + FirstName + LastName);
		System.out.println("Kişi kayıt işlemi tamamlandı.");
		
	}
	
	public String FirstName;
	public String LastName;
	public String NationalIdentity;
	public String Gender; 
	public String Job;
	
	public IndividualCustomer(int id, String address, String phone, String firstName, String lastName,
			String nationalIdentity, String gender, String job) {
		super(id, address, phone);
		FirstName = firstName;
		LastName = lastName;
		NationalIdentity = nationalIdentity;
		Gender = gender;
		Job = job;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	
	
	
	

}
