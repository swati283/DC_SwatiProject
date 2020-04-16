package Package1;

public class Class2 {
	
 //((((10+2)-2)+2)*2)/2)

	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
		}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
		
		}
	
	public int mul(int m , int n )
	{
	    int o;
		o=m*n;
		return o;
		}
	
	public void div(int s,int r)
	{
	int t;
	t=s/r;
	System.out.println("Output of expression is " +t);
	}
	
	public static void main(String[] args) {
		Class2 obj=new Class2();
		{
			int x1=obj.sum(10,2);
			int x2=obj.sub(x1, 2);
			int x3=obj.sum(x2,2);
			int x4=obj.mul(x3,2);
			obj.div(x4,2);
			
			
			
		}
		
		
		
	}
	
	
	
	
	

}
