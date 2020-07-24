package accountpackage;

public class SavingAccount extends Account {

	String homeAddress;
	public SavingAccount(String Name, int age, double balance,String HomeAddress) {
		super(Name, age, balance);
		this.homeAddress=HomeAddress;
	}
	
	String getHomeAdd()
	{
		return homeAddress;
	}
	void SetHomeAdd(String HomeAddress)
	{
		this.homeAddress=HomeAddress;
	}
}
