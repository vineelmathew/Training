
public class Calculator {
	int result;
public int add(int a, int b) {
	result=a+b;	
	return a+b;
	}
public double add(double a,double b)
{
	return a+b;
}

	public int sub(int a, int b) {
		return a-b;
	}
	public int div(int a,int b)
	{
		if(b==0)
		{
			return 0;
		}
		else
		{
			return a/b;
		}
	}
	public int product(int a,int b)
	{
		return a*b;
	}
	public int SendResult()
	{
		return result;
	}
	
	
}