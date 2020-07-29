package accountpackage;
import java.util.*;
public class AcMain {

	public static void main(String[] args) {
		Ac acobject1=new Ac("vineel",999.44,23);
		Ac acobject2=new Ac("Rudrapati",1899.33,33);
		Ac acobject3=new Ac("Dev",1893.33);
		Ac acobject4=new Ac();
		Ac Account[]=new Ac[4];
		Account[0]=acobject1;
		Account[1]=acobject2;
		Account[2]=acobject3;
		Account[3]=acobject4;
		List alist=new ArrayList();
		alist.add(acobject1);
		alist.add(acobject2);
		alist.add(acobject3);
		alist.add(acobject4);
		
		acobject1.credit(100.45);
		acobject2.debit(500.55);

		
	for(Ac acs:Account)
	{
		System.out.println("The Name is "+acs.getholderName()+"  "+"Balance is "+acs.getBalance()+" "+acs.getAge());
	}
	
	System.out.println("*****printing using list");
	for(int i=0;i<alist.size();i++)
	{
		System.out.println("Age ="+((Ac) alist.get(i)).getAge());
		System.out.println("Balance is "+((Ac) alist.get(i)).getBalance());
	
	}
	}
	
	

}
