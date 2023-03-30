package SessionJava8Practice;

public interface InstanceReference 
{
	void display();

}
class InstanceInterfaceTest 
{
	public void display()
	{
		System.out.println("Hello ,This is Instance Method");
	}
	public static void main(String[] args) {
		InstanceInterfaceTest iit=new InstanceInterfaceTest();
		InstanceReference ir=iit::display; 
		ir.display();// By Using Class Object
		
		InstanceReference ir1=new InstanceInterfaceTest()::display;
		ir1.display();// By using Anonymous Object
	}
}
