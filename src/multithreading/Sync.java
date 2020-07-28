package multithreading;

public class Sync implements Runnable {

	private Nameclass name;
	public Sync(Nameclass name) {
		this.name = name;
	}


	@Override
	public void run() {
		name.callName();
	}

}
