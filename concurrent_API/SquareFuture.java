package concurrent_API;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareFuture 
{
	
	
	private ExecutorService executer=Executors.newSingleThreadExecutor();
	public static void main(String[] args) 
	{
	
		
		SquareFuture sf=new SquareFuture();
		System.out.println(sf.calculate(5));
		
		
		
		
	}
	
	   public Future<Integer> calculate(Integer input)
	   {
		   return executer.submit(()->{
			   Thread.sleep(1000);
		   
		return input *input;
		   });   
	   }
	
   
}
