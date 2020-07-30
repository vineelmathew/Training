package assignment3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class CustomerMain {
	Map<String,Customer> details = new HashMap<>();
	public static void main(String[] args) {
		CustomerMain demo=new CustomerMain();
		demo.runApp();
	}
	public void runApp()
	{
		final String id1="c22",id2="a44",id4="f66",id3="iiu";
		Account a1 = new Account(8793.323, "IU8U234427"); // for the balance and pancard
		Account a2 = new Account(78632.5, "GW3R271234");
		String pan1=a1.getPancard();
		String pan2=a2.getPancard();
		BusinessCustomer b1 = new BusinessCustomer(id1, "VINEEL", "HYDERABAD"); // branch, name, location/address for
																					// business customer
		BusinessCustomer b2 = new BusinessCustomer(id2, "RUDRAPATI", "BANGALORE");
		b1.setAccount(a1);
		b2.setAccount(a2);
		Account a3 = new Account(6693.323, "IU8U237");
		Account a4 = new Account(88632.5, "GW3R234");
		RegularCustomer r1 = new RegularCustomer(id3, "LEO", "NEW YORK");
		RegularCustomer r2 = new RegularCustomer(id4, "DAVE", "LA");
		r1.setAccount(a3);
		r2.setAccount(a4); // setting the account details. which is the customer class. with the method
						// setac(Account ac)
						// where object is passed directly
		details.put(b1.getId(), b1);
		details.put(b2.getId(), b2);
		details.put(r1.getId(), r1);
		details.put(r2.getId(), r2);
		Set<String> keys = details.keySet();
		
	/*	ArrayList Businesscu=new ArrayList(details.values());
		System.out.println("***** printing the values in the business customer");
		for(int i=0;i<Businesscu.size();i++)
		{
			
		}
   */
		
		for (String key : keys) {
			Customer current = details.get(key);	
			boolean isB = current instanceof BusinessCustomer;
			if (isB) {
				BusinessCustomer busc = (BusinessCustomer) current;
				display(busc);
			}
			boolean isR = current instanceof RegularCustomer;
			if (isR) {
				RegularCustomer regc = (RegularCustomer) current;
				display(regc);
			}
		}
		Customer fetch1=findById(id1);
		Customer fetch2=findById(id2);
		Boolean compareByName=compareByName(fetch1,fetch2);
	}
	public  void display(BusinessCustomer busc) {
		String name = busc.getName();
		String address = busc.getBusinessAddress();
		String id = busc.getId();
		Account act=busc.getAccount();
		System.out.println("******** BUSINESS CUSTOMERS********");
		System.out.println("name is " + name + " address is " + address + " bank is " + id);
		System.out.println("The balance is= "+act.getBalance()+" pancard is "+act.getPancard());
	}

	public void display(RegularCustomer regc) {
		String name = regc.getName();
		String address = regc.getHomeAddress();
		String id = regc.getId();
		Account act=regc.getAccount();
		System.out.println("******** REGULAR CUSTOMERS********");
		System.out.println("name is " + name + " address is " + address + " bank is " + id);
		System.out.println("The balance is= "+act.getBalance()+" pancard is "+act.getPancard());
	}
	
	public Customer findById(String id)
	{
		Customer customer=details.get(id);
		return customer;
	}
	
	public boolean compareByName(Customer b1,Customer b2)
	{
		String name = b1.getName();
		String name2= b2.getName();
	    boolean check=name.equals(name2);
	    return check;
	}
	
	
	
	
}
