package Package1;

public class Parentclass {
	
	
	public Parentclass()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	public Parentclass(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	public Parentclass(int a, int b)

{
		this(10);
		System.out.println("Parent two parameterized constructor");
	}
	
	public Parentclass(int a, int b, int c)
	{
	
		System.out.println("Parent three parameterized constructor");
	}
	
	public static void main(String[] args)
	{
		
	}
	
}
