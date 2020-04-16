package Package1;

import java.util.Scanner;

public class Scanner2 {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
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
		
Scanner s=new Scanner(System.in);

System.out.println("Please enter value of x1");
int x1=s.nextInt();

System.out.println("Please enter value of x2");
int x2=s.nextInt();

System.out.println("Please enter value of x3");
int x3=s.nextInt();

System.out.println("Please enter value of x4");
int x4=s.nextInt();

System.out.println("Please enter value of x5");
int x5=s.nextInt();

Scanner2 obj=new Scanner2();
int a=obj.sum(x1, x2);
int b=obj.mul(a, x3);
int c=obj.sum(b, x4);
int d=obj.sub(c, x5);
int e=obj.div(d, 2);

System.out.println("Final output of expression is "+e);
	
}
	
}
