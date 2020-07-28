package numbersums;

public class Disariumnumber 
{
	public static void main(String args[])
	{
		int n=175,sum=0,d,temp;
		int count=0;
		temp=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0)
		{
			d=n%10;
			sum=sum+(int)Math.pow(d,count);
			n=n/10;
			count--;
		}
		if(sum==temp)
			System.out.println(temp+" is a disarium number");
		else
			System.out.println(temp+" is not a disarium number");
	}

}
