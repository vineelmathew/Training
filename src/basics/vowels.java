package basics;

public class vowels {
public static void main(String args[])
{
char vowels[]= {'v','d','x','e','i','p','a','q','o','u','k'};
for(int i=0;i<vowels.length;i++)
{
	if(vowels[i]=='a' ||vowels[i]=='e' ||vowels[i]=='i' ||
			vowels[i]=='o' ||vowels[i]=='u')
	{
		System.out.print(vowels[i]+"  ");
	}
}	
}	
}
