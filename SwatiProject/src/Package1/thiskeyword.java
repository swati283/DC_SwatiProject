package Package1;

public class thiskeyword {

	
	public void method0()

	{
		this.method3(10,20,30);
		System.out.println("Default Method");
	}
	
public void method1(int a)
{
	this.method0();
	System.out.println("One Parameterized Method");

}
public void method2(int a, int b )
{
	this.method4(10, 20, 30, 40);
	System.out.println("Two Parameterized Method");
}
public void method3(int a, int b,int c )
{
	System.out.println("Three Parameterized Method");
}
public void method4(int a, int b,int c,int d )
{
	this.method1(10);
	System.out.println("Four Parametwrized Method");
}

public static void main(String[] args) 
{
thiskeyword obj=new thiskeyword();
obj.method2(10,20);


	
}


}
