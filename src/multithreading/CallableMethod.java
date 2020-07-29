package multithreading;

import java.util.concurrent.Callable;

public class CallableMethod implements Callable<Integer> {

	public Integer call() throws Exception {
		int sum=0;
		for(int i=0;i<11;i++) {
		sum=sum+i;	
		Thread.sleep(100);
		}
		return sum;
		
	}
}