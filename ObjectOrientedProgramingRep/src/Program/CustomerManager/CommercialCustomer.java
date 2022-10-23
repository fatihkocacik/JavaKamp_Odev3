package Program.CustomerManager;

public class CommercialCustomer extends Customer implements ICustomerManager{

	public void save() {
		System.out.println("");
		System.out.println("Şirket Başvurunuz Alındı, Şirket İsmi ; " + CompanyName);
		System.out.println("Şirket kayıt işlemi tamamlandı.");
	}

	public String TaxId;
	public String CompanyName;

	public CommercialCustomer(int id, String companyName, String address, String phone, String taxId) {
		super(id, address, phone);
		TaxId = taxId;
		CompanyName = companyName;
	}

	public String getTaxId() {
		return TaxId;
	}

	public void setTaxId(String taxId) {
		TaxId = taxId;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

}
