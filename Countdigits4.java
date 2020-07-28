package numbersums;

public class Countdigits4 
{
	public static void main(String args[])
	{
		int n,d,count=0;
		n=12345941;
		while(n>0)
		{
			d=n%10;
			count++;
			n=n/10;
		}
		System.out.println("Number of digits:"+count);
	}

}
