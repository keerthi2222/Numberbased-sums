package numbersums;

public class Cubessum3 
{
	public static void main(String args[])
	{
		int n=3;
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+(i*i*i);
		}
		System.out.println(sum);
	}

}
