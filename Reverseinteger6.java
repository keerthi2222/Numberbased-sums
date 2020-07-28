package numbersums;

public class Reverseinteger6 
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=4569;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		System.out.println("Reverse of the integer:"+sum);
	}

}
