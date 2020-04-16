package Package1;

public class Nonstatic {
	public void abc()
	{
		System.out.println("Non static method");
	}
public static void main(String[] args) {
	
	Nonstatic obj=new Nonstatic();//this can only be achieved by creating object and calling method using object
	obj.abc();
	
	
}
}
