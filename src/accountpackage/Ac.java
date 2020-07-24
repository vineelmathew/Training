package accountpackage;

public class Ac {

String holderName;
double balance=1000;
int age=21;

Ac(String holderName, double balance, int age) {
this.holderName=holderName;
this.balance=balance;
this.age=age;
System.out.println("This is 3 argument constructor");
}
Ac(String holderName,double balance)
{
	this(holderName,balance,21);
	System.out.println("This is 2 argument constructor");
}

Ac()
{
	this("NULL Name",1000,21);
	System.out.println("This is zero argument constructor using this keyword");
	System.out.println(" ");
}

String getholderName()
{
	return holderName;
}
void setHolderName(String holderName)
{
	this.holderName=holderName;
}
double getBalance()
{
	return balance;
}
int getAge()
{
	return age;
}
void setAge(int age)
{
	this.age=age;
}

void setBalance(double balance)
{
	this.balance=balance;
}

public double credit(double d) {
	balance=balance+d;
	return balance;
	
}

public double debit(double d) {
	// TODO Auto-generated method stub
	if(d<=balance)
	{
		balance=balance-d;
	}
	return balance;
}







	
	
	
	
	
}
