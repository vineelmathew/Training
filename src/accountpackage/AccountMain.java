package accountpackage;
import java.util.*;
public class AccountMain {

	public static void main(String[] args) {
		Account accountArray[]=new Account[4];
		Account acc1=new Account("vineel",22,998.50);
		Account acc2=new Account("Rudrapati",34,9982.56);
		CurrentAccount acc3=new CurrentAccount("Vineel1",44,56.343,"Hyderabad");
		SavingAccount acc4=new SavingAccount("ajay",42,738.32,"Bangalore");
		accountArray[0]=acc1;
		accountArray[1]=acc2;
		accountArray[2]=acc3;
		accountArray[3]=acc4;
		List Alist=new ArrayList();
		Alist.add(acc1);
		Alist.add(acc2);
		Alist.add(acc3);
		Alist.add(acc4);
		
		
		
		
		
		
		

/*for (int i = 0; i < AccountArray.length; i++) {
	Account Ac=AccountArray[i];
	String name=Ac.getName();
	int age=Ac.getAge();
	double balance=Ac.getBalance();
	System.out.println("The name is "+" "+name+" Age is "+age+" balance is "+balance);
	
}*/
		for (int i=0;i<accountArray.length;i++)
		{
			Account ac=accountArray[i];
			int age=ac.getAge();
			String name=ac.getName();
			double balance=ac.getBalance();
			Boolean isCurrent= ac instanceof CurrentAccount;  //  only objects related to the current Account
			if(isCurrent)
			{
				CurrentAccount ca=(CurrentAccount)ac;
				System.out.println("The name is "+" "+name+" Age is "+age+" balance is "+balance);
				System.out.println("The Business Address for the CurrentAccount is "+ca.getBusiAddr());
				
			}
			Boolean isSaving=ac instanceof SavingAccount;
			if(isSaving)
			{
				SavingAccount sa=(SavingAccount)ac;
				System.out.println("The name is "+" "+name+" Age is "+age+" balance is "+balance);
				System.out.println("The Home Address for the CurrentAccount is "+sa.getHomeAdd());
			}
			
			
		}
		
		System.out.println("Printing using list");
        for(int i=0;i<Alist.size();i++)
        {
        	System.out.println(Alist.get(i));
        }
		
		
		
		

	}

}
