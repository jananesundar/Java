import java.util.Scanner;
class fact
{
	public static void main(String[]args)
	{
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.print("The factorial is : "+fact);
	}
}