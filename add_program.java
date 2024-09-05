class add_program
{
	static void add(String a,String b)
	{
		System.out.println(a+b);
	}
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[]args)
	{
		add(10,20);
		add(20,30);
		sub(130,40);
		sub(40,50);
		mul(30,70);
		mul(4,9);
		div(50,5);
		div(500,100);
	}
}