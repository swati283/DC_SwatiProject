package Package1;

public class Class3 {
	
	//((((10/2)*2)+2)+2)-2)
	
public int div(int a,int b)
{
 int c;
 c=a/b;
 return c;
}
public int mul(int x, int y)
{
	int z;
	z=x*y;
	return z;
}

public int add(int s,int r)
{
	int t;
	t=s+r;
	return t;
}
public void sub (int e,int f)
{
	int g;
	g=e-f;
	
	System.out.println("Output of expression is "+g);
}

public static void main(String[] args) {
	Class3 obj=new Class3();
	int x1=obj.div(10,2);
	int x2=obj.mul(x1, 2);
	int x3=obj.add(x2,2);
	int x4=obj.add(x3, 2);
	obj.sub(x4, 2);
	
}
}
