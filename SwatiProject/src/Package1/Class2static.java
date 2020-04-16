package Package1;

public class Class2static {
	public static void method2()
	{
		System.out.println("I m static method of Class2 ");
	}
public static void main(String[] args) {
	Class1static.method1(); //Called method1 from different class using classname
	Class2static.method2(); //Called method2 from same class using classname
	Class1static obj=new Class1static();//Called method1 from different class using object creation 
	obj.method1();
	
	
}
}
