package Package1;

public class Class1 {
	
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("This is first program-Method1");
	}
	public void display2()
	{
		System.out.println("This is first program-Method2");
	}
	public static void main(String[] args)
	{
		
		Class1 obj=new Class1();
		{
		obj.age=20;
		obj.roll_no=30;
		System.out.println(obj.age);
		System.out.println(obj.roll_no);
	obj.display1();
	obj.display2();
	
	}
	
	Class1 obj2=new Class1();
	{
	obj2.age=40;
	obj2.roll_no=50;
	System.out.println(obj2.age);
	System.out.println(obj2.roll_no);
		
	obj2.display1();
	obj2.display2();
	
	}
	
}
}

	
	
