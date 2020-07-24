
public class CalculatorMain {
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		Calculator calobject=new Calculator();
		System.out.println("The Addition is "+calobject.add(a,b));
		System.out.println("The Subtraction is "+calobject.sub(a,b));
		System.out.println("The Division is "+calobject.div(a, b));
		System.out.println("The Product is "+calobject.product(a, b));
		System.out.println("The new result is "+calobject.SendResult());
		System.out.println("The double add result is "+calobject.add(893.44, 2344.24));  //method overloading. 
	}
}
