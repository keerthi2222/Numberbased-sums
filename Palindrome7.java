package numbersums;

public class Palindrome7 
{
	public static void main(String args[])
	{
		int n,d,sum=0;
		n=12121;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
