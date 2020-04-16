package Package1;

public class Childclass extends Parentclass{
	public Childclass()
	{
		super(1,2);
		System.out.println("Child Deafult Constructor");
	}
	public Childclass(int a)
	{
		this(1,2,3);
		System.out.println("Child one parameterized Constructor");
	}

	public Childclass(int a, int b)
	{
		this(20);
		System.out.println("Child two parameterized Constructor");
	}
	public Childclass(int a, int b, int c)
	{
		this();
		System.out.println("Child three parameterized Constructor");
	}
	
	
	public static void main(String[] args)
	{
		
		Childclass obj=new Childclass(10,20);
		
				
	}
	
	
	
	
	
}


