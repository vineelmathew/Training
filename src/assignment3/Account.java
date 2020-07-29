package assignment3;

public class Account {
	private double balance;
	private String pancard;
	
	public Account(double balance, String pancard) {
		super();
		this.balance = balance;
		this.pancard = pancard;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}



}
