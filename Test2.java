class Parent
{
	public void m1()
	{
		System.out.println("Hi");
	}
	public  void m2()
	{
		System.out.println("Hello");
	}
	public void m3()
	{
		System.out.println("Hey");
	}
}
class Child extends Parent
{
	public void m3()
	{
		System.out.println("java");
	}
	public void m4()
	{
		System.out.println("React");
	}
}
class Test2
{
	public static void main(String[] args)
	{	Parent p=new Parent();
		p.m1();
		p.m2();
		p.m3();

6
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		c.m4();
		
		Parent p1=new Child();
		p1.m1();
		p1.m2();
		p1.m3();
		
		C.m4();
	}

}


