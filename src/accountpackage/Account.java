package accountpackage;

public class Account {
String name;
int age;
double balance;
public Account(String Name, int age, double balance) {
this.name=Name;
this.age=age;
this.balance=balance;
}
int getAge()
{
	return age;
}
void setAge(int Age)
{
	this.age=Age;
}
public String getName() {
	return name;
}

double deposit(double amount)
{
	amount=amount+balance;
	return amount;
}
double withdraw(double withdraw)
{
	if(balance>withdraw)
	{
		balance=balance-withdraw;
	}
	return balance;
}
public double getBalance() {
	return balance;
}
}
