package numbersums;

public class Twistedprimenumber
{
	public static void main(String args[])
	{   
		int n=13;
		int reverse,sum=0;
	while(n!=0)
	{
		reverse=n%10;
		sum=sum*10+reverse;
		n=n/10;
	}
		int flag=0;
		for(int j=2;j<=sum/2;j++)
		{
			if(sum%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n+"Twisted prime number");
		else
			System.out.println(n+"Not a Twisted prime number");
	}

}
