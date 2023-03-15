package java8NewPrograms;

 public interface Gopal 
{
	public void krishna();

}                                                                            
class LambdaExpressionExample
{
	public static void main(String[] args) {
		
		String s="TELAPUTTA GOPALA KRISHNA";
		
		Gopal g=new Gopal()
				{

					@Override
					public void krishna() {
						System.out.println(s);
						
					}
			
				};
	}
}
