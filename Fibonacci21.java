package numbersums;

public class Fibonacci21 
{
public static void main(String args[])
{
	int n1=0,n2=1,n3,i;
	System.out.println(" "+n1+" "+n2);
	for(i=1;i<10;i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
}
}
