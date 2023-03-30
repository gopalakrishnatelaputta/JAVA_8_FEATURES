package SessionJava8Practice;

public interface Gk 
{
	void draw();

}
 class Krishna 
{

	/*@Override
	public void draw() {
		System.out.println("hii KRISHNA");
		
	}*/
	public static void main(String[] args) 
	{
		Gk k=new Gk()
				{ 
			public void draw() {
				System.out.println("hii KRISHNA");
				
			}
				};
		k.draw();
		
	}
	
}
