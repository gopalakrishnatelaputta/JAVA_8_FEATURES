package java8;
@FunctionalInterface
public interface Test 
{
   int add(int a,int b);
   
}
class Demo
{
	public static void main(String[] args) 
	{
		Test t=Integer::sum;
		int x=t.add(65, 55);
		System.out.println(x);
		
	}
}
