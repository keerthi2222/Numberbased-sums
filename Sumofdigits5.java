package numbersums;

public class Sumofdigits5
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=123451;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of digits of the integer:"+sum);
		}

}
