package sortnames;

import java.util.Scanner;

public class sort {
public static void main(String [] args)
{
	Scanner n=new Scanner(System.in);
	int k,i,j;
	System.out.println("enter number of names you want to enter");
	k=n.nextInt();
	k++;
	String input[]=new String[k];
	String temp=new String();
	for(i=0;i<k;i++)
	{
		input[i]=n.nextLine();
	}
	
	for(i=0;i<k;i++)
	{
		for(j=i+1;j<k;j++)
		{
			if(input[i].compareTo(input[j])>0)
			{
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
	}
	
	
	System.out.println("Sorted order is");
	for(i=0;i<k;i++)
	
	{
				System.out.println(input[i]);
	}
	     }
	
	

}
