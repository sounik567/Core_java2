class Test
{ 
	
		public static void main(String[] args)
		{
			NotWork n = new NotWork();
			n.baddy();
		}
		
}
class Bug
{
		public final void baddy()
		{
			System.out.println("This program will not work");
		}
}
class NotWork extends Bug
{
		public final void baddy()
		{
			System.out.println("Due to final keyword");
		}
}
