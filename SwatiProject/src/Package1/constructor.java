package Package1;

public class constructor {
	
	public constructor()
	{
		this(50,60);
	
		System.out.println("Deafault Constructor");
	}
public constructor(int a)
{
	this(20,30,40);
	System.out.println("One Parameterized Constructor");
}
public constructor(int a, int b)
{
	System.out.println("Two Parameterized Constructor");
}

public constructor(int a, int b, int c)
{
	this();
	System.out.println("Three Parameterized Constructor");
}
public constructor(int a, int b, int c, int d)
{
	this(10);
	System.out.println("Four Parameterized Constructo");
}
public static void main(String[] args) {
	
	constructor obj=new constructor(10,20,30,40);
	
}



}
