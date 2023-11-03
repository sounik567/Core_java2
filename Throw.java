class A
{
	public static void main(String[] args) throws InvalidUserException
	{
		int x =100;
		if(x == 500)
		{
			System.out.println("value comes is : "+x);
		}
		else
		{
			InvalidUserException e = new InvalidUserException("ENTER VALID VALUE");
			throw e;
		}
		
	}
}
class InvalidUserException extends Exception
{
	InvalidUserException(String msg)
	{
		super(msg);
	}
}