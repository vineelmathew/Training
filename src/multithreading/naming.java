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
		boolean t1live=thread1.isAlive();
		boolean t2live=thread2.isAlive();
		System.out.println("before joining");
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After joining");
		System.out.println("The Thread 1 ="+t1live+"The Thread 2="+t2live);
		
		
	}

}
