package wrapperDemo;
//integer class
public class WrapperEx {

	public static void main(String[] args) {
		int n=123; // int is primitive data type
		Integer intobject=new Integer(331);// this is Integer class and a wrapper class used for inbuilt method
		int primitivetype=intobject.intValue();
		System.out.println(primitivetype);
		byte b=intobject.byteValue();
		System.out.println(b);
		String s=intobject.toString();
		System.out.println(s instanceof String);
		Long longvalue=intobject.longValue();
		System.out.println(longvalue);
		System.out.printf("%d",n);
	}

}
