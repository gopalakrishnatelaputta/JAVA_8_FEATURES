package concurrent_API;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample 
{
	public static void main(String[] args) {
		ExecutorService exser=Executors.newFixedThreadPool(10);
		exser.execute(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Execter Serviece");
				
			}
			
		});
		exser.shutdown();
	}

}
