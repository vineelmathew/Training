package multithreading;

public class RunnableMain {

	public static void main(String[] args) {

		
		Runnable threadrun=new RunnableExample("Runnable");
		Thread thread11=new Thread(threadrun);
		thread11.start();
		try
		{
		for(int i=0;i<6;i++)
		{
			System.out.println("this is runnable main "+i);
			thread11.sleep(1000);
		}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}

}
