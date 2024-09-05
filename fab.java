import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int i;
		int num1=0,num2=1,c;
		System.out.printf("%d\t",num1);
		System.out.printf("%d\t",num2);
		for(i=0;i<a-2;i++)
		{
			c=num1+num2;
			num1=num2;
			num2=c;
			System.out.printf("%d\t",c);
		}
	}
}