package assignment3;

public class BusinessCustomer extends Customer {
	private String businessAddress;

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public BusinessCustomer(String id, String name, String businessAddress) {
		super(id, name);
		this.businessAddress = businessAddress;
	}

}
