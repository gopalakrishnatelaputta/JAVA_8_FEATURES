package java8;

public interface Default_and_Static_methods_in_Interface 
{
	public static void sys()
	{
		System.out.println("Gopala Krishna");
	}
	
	default void display()
	{
		System.out.println("Krishna");
	}
	
}
class Demo1 implements Default_and_Static_methods_in_Interface
{
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		d.display();
		Default_and_Static_methods_in_Interface.sys();
		
	}
}
