package exceptions;

public class ArrayOutofbounds {
	public static void main(String args[]) {
		try {
			int a[] = { 1, 3, 4, 345, 5 };
			int e = a[7];
			System.out.println(e);
		} 
		catch (Throwable e) {
			e.printStackTrace();
			System.out.println("caught the exception");
		}
	}
}
