package multithreading;
import java.util.concurrent.*;
public class CallableMain {

	public static void main(String[] args) throws Exception{
		ExecutorService exse=Executors.newCachedThreadPool();
		Callable<Integer>task1=new CallableMethod();
		Future<Integer>futureresult=exse.submit(task1);
		exse.shutdown();
		System.out.println("The result is="+futureresult.get());
		System.out.println("the result after the futureresult="+futureresult.isDone());

	}

}
