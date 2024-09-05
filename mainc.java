class A
{
	void add()
	{
		System.out.println("I am Class A");
	}
}

class poly extends A
{
	void disp()
	{
		System.out.println("I am Class B");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		A b1 = new poly();
		b1.add();
	}
}
