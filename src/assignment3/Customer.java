package assignment3;

public class Customer {
	private String name;
	private String id;
    private static Account ac;
	public Customer(String id, String name) {
		super();
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
	
	public static Account getac()
	{
		return ac;
		
	}
	public void setac(Account ac)
	{
		this.ac=ac;
	}
}
