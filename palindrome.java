package palin;
import java.util.Scanner;
public class palindrome {
public static void main(String []args)
{
	Scanner h=new Scanner(System.in);
	String s=h.nextLine();
	int n=s.length();
	int i;
	int f=0;
	for(i=0;i<n/2;i++)
	{
		if(s.charAt(i)!=s.charAt(n-i-1))
		{
			f=1;
			break;
		}
	}
	if(f==0)
		System.out.println("string is palindrome");
	else
		System.out.println("String is not palindrome");
	
}
}
