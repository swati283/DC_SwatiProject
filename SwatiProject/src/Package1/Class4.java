package Package1;

import java.util.Scanner;

public class Class4 {
	
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a,int b)
		{
			int c;
			c=a-b;
			return c;
		
		//System.out.println("a");
	}
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	
public static void main(String[] args) 
{
	//((((x1+x2)-x3)*x4)+2)/2)
	System.out.println("Please enter Value for x1");
	Scanner s=new Scanner(System.in);
	int x1=s.nextInt();
	
	System.out.println("Please enter value for x2");
	int x2=s.nextInt();
	
	System.out.println("Please enter value for x3");
	int x3=s.nextInt();
	
	System.out.println("Please enter value for x4");
	int x4=s.nextInt();
	
	Class4 obj=new Class4();
	
	int a=obj.sum(x1, x2);
	int b=obj.sub(a, x3);
	int c=obj.mul(b, x4);
	int d =obj.sum(c,2);
	int e=obj.div(d, 2);
	System.out.println("Result of expression is "+e);
	

	
}
}
