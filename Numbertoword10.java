package numbersums;

public class Numbertoword10 
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=1456;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		
	}

}
