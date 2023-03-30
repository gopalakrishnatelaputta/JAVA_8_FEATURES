package java8;

public interface Sayable 
{
	void say();
	
}
class MethodReference
{
	public static void Saysomething()
	{
		System.out.println("This is SaySomething method ");
	}
	public static void main(String[] args) {
		Sayable s=MethodReference::Saysomething;
		s.say();
	}
}
