package javaprime;

import java.util.Scanner;

public class prime {
	
public static int isprime(int i)
{
	int k=(int)Math.sqrt(i);
	int j;
	int f=0;
	for(j=2;j<=k;j++)
	{
		if(i%j==0)
		{
			f=1;
			break;
		}
	}
	
	return(f);	
}
	
public static void main(String []args)
{
	Scanner o=new Scanner(System.in);
	int n,i;
	n=o.nextInt();
	for(i=2;i<=n;i++)
	{
		int f=0;
		f=isprime(i);
		if(f==0)
			System.out.println(i);
	}
}
}
