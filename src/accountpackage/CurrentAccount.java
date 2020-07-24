package accountpackage;

public class CurrentAccount extends Account {

	String businessAddress;
	public CurrentAccount(String name, int age, double balance,String BusinessAddress) {
		super(name, age, balance);
		this.businessAddress=BusinessAddress;
	}
	String getBusiAddr()
	{
		return businessAddress;
	}
	void setBusiAddr(String BusinessAddress)
	{
		this.businessAddress=BusinessAddress;
	}
	

}
