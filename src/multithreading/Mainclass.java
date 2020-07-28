package multithreading;

public class Mainclass {

	public static void main(String[] args) {
	Thread1 throbj=new Thread1("thread1");
	throbj.start();

	try
	{
		for(int i=1;i<3;i++)
		{
			System.out.println("this is main class "+i);
			throbj.sleep(1000);
		}
	}
	catch(Throwable e)
	{
		e.printStackTrace();
	}
	System.out.println("The thread priority is "+throbj.getPriority());
	
	
	
	}

}
