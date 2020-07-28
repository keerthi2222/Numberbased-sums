package numbersums;

public class Digitfrequency9 
{
	public static void main(String args[])
	{
		int n;
		int d,p;
		for(int i=1;i<=9;i++)
		{
			n=343;
			int c=0;
			while(n>0)
			{
				d=n%10;
				if(d==i)
				{
					c++;
					p=d;
				}
				n=n/10;
			}
			if(c>=1)
				System.out.println(""+i+"occurs is"+c);
		}
	}

}
