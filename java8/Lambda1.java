package java8;
@FunctionalInterface
public interface Lambda1 
{
	public void draw(); 

}
class Test1 
{
	public static void main(String[] args) 
	{
		Lambda1 l=()->System.out.println("hello");
		l.draw();
		
	}

	
}
