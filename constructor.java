class Test
{		
		public static void main(String[] args)
		{	
			   Independence i = new Independence();
			   i.m1 ();
			   Republic r = new Republic();
		
		}
}
class Independence
{
		Independence()
		{		this(10);
				System.out.println("had");
		}
		Independence(int x)
		{
				System.out.println("We");
		}
		{
				System.out.println("Today");
		}
		public void m1()
		{
				System.out.println("lassi Party");
		}
			
}
class Republic extends Independence
{
		Republic()
		{
				this(40);
				System.out.println("coaching Institute");
		}
		Republic(int x)
		{
				System.out.println("beside");
		}


}

