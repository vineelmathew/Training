package multithreading;

public class RunnableExample implements Runnable {
	public String name;
	
	public RunnableExample(String name) {
		this.name=name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void run() {
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println(name+" i");
			 Thread.sleep(1000);
			}
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
	}

}
