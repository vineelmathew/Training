package stringdemos;

public class StringBuilderEx {

	public static void main(String[] args) {
	StringBuilder builder=new StringBuilder();
	builder.append("vineel ").append("Rudrapati");
	String str=builder.toString();
	System.out.println(str);
	
	/*
	 * 
	 * as the strings are immutable. string builder is used for concatenation
	 */

	}

}
