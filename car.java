class car
{
	static void lux()
	{
		System.out.print("this very high space and cost car\n");
	}
	static void normal()
	{
		System.out.print("This is very normal and which is of high price car has\n");
	}
	static void low()
	{
		System.out.print("This is the very low cost car which as less space");
	}
	public static void main(String[] args)
	{
		car c=new car();
		c.lux();
		c.normal();
		c.low();
	}
}