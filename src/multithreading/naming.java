package multithreading;
public class naming {
	public static void main(String argsp[])
	{
		Nameclass name=new Nameclass();
		Thread thread1=new Thread(new Sync(name));
		Thread thread2=new Thread(new Sync(name));
		Thread thread3=new Thread(new Sync(name));
		Thread thread4=new Thread(new Sync(name));
		Thread thread5=new Thread(new Sync(name));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}

}
