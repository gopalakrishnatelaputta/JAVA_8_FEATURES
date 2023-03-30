package SessionJava8Practice;

public interface StaticMethodReference
{
	void say();
	

}
class MethodReference1
{
	public static void saySomething()
	{
		System.out.println("Hello ,This is Static Method");
	}

	public static void main(String[] args) {
		StaticMethodReference smr=MethodReference1::saySomething;
		smr.say();
	}
}
