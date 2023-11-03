class DynamicObject
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		String className = args[0];
		Class c=Class.forName(className);				
		B a =(B)c.newInstance();
		a.m1();
		
	}
}
class A
{
	public void m1()
	{
		System.out.println("When we pass  Java DynamicObject A THen This Will print");
	}
}
class B
{
	public void m1()
	{
		System.out.println("When we pass  Java DynamicObject B THen This Will print");

	}
}
