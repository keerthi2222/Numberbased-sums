package numbersums;

public class Harshhadnumber 
{
	public static void main(String args[])
	{
		int n=156;
		int d=0,sum=0,temp;
		temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(temp%sum==0)
			System.out.println(temp+ " is a Harshhad Number");
		else
			System.out.println(temp+ " is not a Harshhad Number");
	}

}
