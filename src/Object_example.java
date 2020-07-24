
public class Object_example {
public void one()
{
	System.out.println("This is first method");
}
public void Two()
{
	System.out.println("This is second method");
}
	
public static void main(String args[])
{
	Object_example object=new Object_example();
	for(int i=0;i<3;i++)
	{
		object.one();
	}
	for(int i=0;i<5;i++)
	{
		object.Two();
	}
}
}
