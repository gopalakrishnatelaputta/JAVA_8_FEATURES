package java8;
interface Gopal
{
	static void second() 
	{
		System.out.println("hii");
	}
	void fisrt();
	
	default void third()
	{
		System.out.println("hello");
	}
}

public class Lambda implements Gopal
{
	public static void main(String[] args) 
	{
		Gopal g= new Lambda();
	    g.third();
	    Gopal.second();
	}

	@Override
	public void fisrt() {
		// TODO Auto-generated method stub
		
	}

}
