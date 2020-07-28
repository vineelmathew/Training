package multithreading;

public class Nameclass {
	synchronized public void callName() {    // synchronized(this); //you can do it in this way also 
		{
			try
			{
			System.out.print("*");
			System.out.print("V");
			Thread.sleep(1000);
			System.out.print("R");
			Thread.sleep(1000);
			System.out.print("*");
		}
			catch(Throwable e)
			{
				e.printStackTrace();
			}
		
	}	
}
}
