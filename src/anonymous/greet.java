package anonymous;

public abstract class greet implements Igreet {

	public static void main(String[] args) {
	Igreet g=new Igreet()
			{
		public String greet()
		{
			return "hello";
		}
			};
System.out.println("calling the interface");
System.out.println(g.greet());

Igreet g2=()->"mathew"; //inline lambda calling
System.out.println(g2.greet());



	}
}
