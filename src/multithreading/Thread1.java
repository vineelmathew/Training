package multithreading;

public class Thread1 extends Thread{
	public Thread1(String msg)
	{
		super(msg);
	}
	public void run() {
		try
		{
			for(int i=1;i<3;i++)
			{
			System.out.println("this is thread class "+i);
			Thread.sleep(1000);
			}
		}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
}
}
