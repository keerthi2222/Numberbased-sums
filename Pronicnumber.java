package numbersums;

public class Pronicnumber
{
	public static void main(String args[])
	{
		int i,j,flag=0;
		for(i=1;i<=100;i++)
		{
			flag=0;
			for(j=1;j<=i;j++)
			{
				if((j*(j+1))==i)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
	}

}
