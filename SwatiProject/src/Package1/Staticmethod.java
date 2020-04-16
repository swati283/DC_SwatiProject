package Package1;

public class Staticmethod {

	public static void method1()
	{
		System.out.println("Static method");
	}
	public static void main(String[] args)
	{
		method1(); //1st way -direct call
		Staticmethod.method1(); //2nd way -calling using classname.method name 
		Staticmethod obj=new Staticmethod();
		obj.method1(); //3rd way - calling method by creating the object
	}
}
