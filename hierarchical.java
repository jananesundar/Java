interface A
{
	int a=100;
}
interface B extends A
{
int b=1000;
int c=a+b;
}
class C implements A,B
{
int d=a;
}
class hierarchical extends c
{
public static void main(String[] args)
{
	hierarchical p = new hierarchical();
	System.out.println("overall student is:"+p.a);
	System.out.println("AIDS students is:"+p.b);
	System.out.println("The sum is:"+p.c);
}
}
