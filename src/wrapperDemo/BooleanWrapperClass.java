package wrapperDemo;

public class BooleanWrapperClass {

	public static void main(String[] args) {
		Boolean bool = false;
		Boolean boolwrapper = new Boolean(true);
		boolean primitivebool = boolwrapper.booleanValue();
		System.out.println("The bool value is " + bool + " " + " Primitivebool value is " + primitivebool);

	}

}
