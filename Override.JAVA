class Parent 
{
	public void m1()
	{
        	System.out.println("Hi");
    	}

	public void m2() 
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

class Test 
{
    	public static void main(String[] args) 
	{
        	Test t=new Test();
		Parent p=new Parent();
		p.m1();
		p.m2();
		Child c=new Child();
		c.m3();
		c.m4();
		Parent pa=new Child();
		pa.m3();
	}

        public void m(Parent pw)
        {	
		pw.m1();
       		pw.m2();
      		pw.m3();
	}
}