class Test
{
	public static void main(String[] args)
	{
		Emp e1=new Emp(1,"Sourav");
		Emp e2=new Emp(2,"Kumar");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}

class Emp
{
	private int id; 
	private String name;
	Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object o)
	{
		int e1id = this.id;
		String e1name = this.name;
	
		Emp e = (Emp) o;

		int e2id = e.id;
		String e2name = e.name;
		if(e1id==e2id && e1name.equals(e2name))
		{
			return true;
		}
		return false;
	}
}