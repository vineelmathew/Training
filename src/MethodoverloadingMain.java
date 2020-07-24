
public class MethodoverloadingMain {

	
	
	
	/*
	 * Main class is used only for main method
	 * objects were created to work with the working class i.e Methodoverloading
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Methodoverloading methodobject=new Methodoverloading();
		System.out.println("This is add method "+methodobject.add(1, 5));
		System.out.println("This is double method "+methodobject.add(6.6, 3.33));
		System.out.println("This is String Method "+methodobject.add("vineel", "rudrapati"));		
	}
}
