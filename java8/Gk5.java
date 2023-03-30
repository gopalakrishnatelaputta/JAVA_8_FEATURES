package java8;

public class Gk5 
{
	
		
			   public static void demoMethod() 
			   {
			      System.out.println("method of super class");
			   }
	}
	 class Sample1 extends Gk5
	 {
			   public static void demoMethod() 
			   {
			      System.out.println("method of sub class");
			   }
			   public static void main(String args[] )
			   {
			      Sample1.demoMethod();
			   }
	}



