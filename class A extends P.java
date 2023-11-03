class A extends P
{
	boolean b;
	double d;
	A(int x, String s, boolean b, double d)
	{
	super(x,s);
	this.b=b;
	this.d=d;
	}
	public void print()
	{
		System.out.println("x is :"+x+ "s is "+s+ "b is : "+b+ "d is :"+d);
	}
}
class B extends P
{
	char c;
	B(int x, String s, char c)
	{
	super(x,s);
	this.c=c;	
	}
}
class C extends P
{
	double d;
	float f;
	C(int x, String s, double d, float f)
	{
	super(x,s);
	this.d=d;
	this.f=f;
	}
}
Abstract class P
{
	int x;
	String s;
	P(int x, String s)
	{
	this.x=x;
	this.s=s;
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1=new A(10,"Pooja", true,23.09);
		B b1=new B(18,"Sahana",'v');
		C c1=new C(15,"Resh",23.09, 34.8f);
	}
}