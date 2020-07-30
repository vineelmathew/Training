package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
	List<String>names=new ArrayList<>();
	names.add("vineel");
	names.add("rudrapati");
	names.add("david");
	names.add("steve");
	List<Integer>nameslen=new ArrayList<>();
	for(String nam:names)
	{
		nameslen.add(nam.length());
	}
	System.out.println("using for each loop without stream");
	for(int len:nameslen)
	{
		System.out.println(len);
	}
	System.out.println("**** using stream*****");
	names.stream().map(city->city.length()).forEach(System.out::println);
	//city->city.length might be a variable or alias

	}

}
