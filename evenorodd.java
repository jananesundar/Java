import java.util.Scanner;
class everorodd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.print("The number is even"+a);
		}
		else
		{
			System.out.print("The number is odd"+a);
		}
	}
}