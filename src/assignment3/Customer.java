package assignment3;

public class Customer {
	private String name;
	private String id;
    private  Account account;
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Account getAccount()
	{
		return account;
		
	}
	public void setAccount(Account ac)
	{
		this.account=ac;
	}
	

	
}
