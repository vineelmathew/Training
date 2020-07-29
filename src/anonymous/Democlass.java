package anonymous;


public class Democlass {

	public static void main(String[] args) {
		Runnable r = new Runnable() //runnable interface
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }; 
        Thread t = new Thread(r); 
        t.start(); 
        System.out.println("Main Thread"); 
	}

}
