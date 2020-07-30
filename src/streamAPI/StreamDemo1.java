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
	}

}
