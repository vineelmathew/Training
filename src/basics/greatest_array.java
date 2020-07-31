package basics;

import java.util.Scanner;

public class greatest_array {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the numbers");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
    }
	int greatest=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>greatest)
		{
			greatest=a[i];
		}
	}
	sc.close();
	System.out.println("The greatest number in the array is "+greatest);
}
}
