package matrixmul;

import java.util.Scanner;

public class mul {
	public static void main(String []args) {
		Scanner o=new Scanner(System.in);
		int r1,c1,r2,c2;
		
		while(true)
		{
			System.out.println("enter dimension of first matrix");
			r1=o.nextInt();
			c1=o.nextInt();
			System.out.println("enter dimension of second matrix");
			r2=o.nextInt();
			c2=o.nextInt();
			if(c1!=r2)
			{
				System.out.println("wrong dimensions\n");
			}
			else
				break;
		}
		
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		int i,j,k,x;
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				a[i][j]=o.nextInt();
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				b[i][j]=o.nextInt();
		
		for(j=0;j<c2;j++)
		{
			for(k=0;k<r1;k++)
			{
				for(x=0;x<c1;x++)
				{
					c[k][j]=c[k][j]+a[k][x]*b[x][j];
				}
			}
		}
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
