import java.util.Scanner;
class Account
{
	static void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number:");
		int n=sc.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter user name:");
			String name=sc.nextLine();
			System.out.println("Enter current amount :");
			int camount=sc.nextInt();
		}
	}
	static void balance()
	{
			int balance-1000;
	}
	static void exit()
	{
		System.out.print("Out");
	}
	public static void main(System[] args)
	{
		Account a=new Account();
		a.details();
		a.balance();
		a.exit();
	}
}