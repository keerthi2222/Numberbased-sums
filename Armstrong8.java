package numbersums;

public class Armstrong8 
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=153;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
