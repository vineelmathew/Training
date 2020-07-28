package multithreading;

public class Nameclass {
	synchronized public void callName() {
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
