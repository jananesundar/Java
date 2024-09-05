import java.util.Scanner;
class leapyear
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year:");
		int y=sc.nextInt();
		if(y%4==0)
		{
			System.out.print("It is a leap year");
		}
		else
		{
			System.out.print("It is not a leap year");
		}
	}
}