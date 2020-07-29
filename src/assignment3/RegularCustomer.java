package assignment3;

public class RegularCustomer extends Customer {

	String homeAddress;

	public RegularCustomer(String id, String name, String homeAddress) {
		super(id, name);
		this.homeAddress = homeAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
