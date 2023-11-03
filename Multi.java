abstract class Parent
{
	String name;
	int age;
	Parent(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class IdCard extends Parent
{
	String sch_name;
	int roll_no;
	IdCard(String name,int age,String sch_name,int roll_no)
	{
		super(name,age);
		this.sch_name=sch_name;
		this.roll_no=roll_no;
	}
	public void print()
	{
		System.out.println("Name: "+name+".......Age: "+age+".......School Name: "+sch_name+".......Roll Number: "+roll_no);
	}
}
class MedCard extends Parent
{
	char Blood_Grp;
	MedCard(String name,int age,char Blood_Grp)
	{
		super(name,age);
		this.Blood_Grp=Blood_Grp;
	}
	public void print()
	{
		System.out.println("Name: "+name+".......Age: "+age+".......Blood Group: "+Blood_Grp);
	}
		
}
class Bio extends Parent
{
	int weight;
	double height;
	Bio(String name,int age,int weight,double height)
	{
		super(name,age);
		this.weight=weight;
		this.height=height;
	}
	public void print()
	{
		System.out.println("Name: "+name+".......Age: "+age+".......Weight: "+weight+".......Height: "+height);
	}
}
class Test
{
	public static void main(String[]args)
	{
		IdCard i=new IdCard("Sourav Kumar", 27,"Xaviers College",1);
		MedCard m=new MedCard("Dr Amarjeet", 25,'O');
		Bio b=new Bio("Monu", 27,64,5.85);

		i.print();
		m.print();
		b.print();
	}
}