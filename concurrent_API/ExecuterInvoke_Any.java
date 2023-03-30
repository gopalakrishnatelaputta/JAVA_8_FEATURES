package concurrent_API;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterInvoke_Any 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exser=Executors.newSingleThreadExecutor();
		Set<Callable<String>>callables=new HashSet<Callable<String>>();
		callables.add(new Callable<String>()
		{
			public String call() throws Exception
			{
				return "Task 1";
			}
			
		});
		
		callables.add(new Callable<String>()
		{
			public String call() throws Exception
			{
				return "Task 2";
			}
			
		});
		
		callables.add(new Callable<String>()
		{
			public String call() throws Exception
			{
				return "Task 3";
			}
			
		});
		
		String Result=exser.invokeAny(callables);
		System.out.println("result  ="+Result);
		exser.shutdown();
		
	}

}
