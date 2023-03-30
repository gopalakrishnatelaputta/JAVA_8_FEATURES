package concurrent_API;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecuterScheduledClass 
{
	public static void main(String[] args) {
		
		ExecuterScheduledClass esc=new ExecuterScheduledClass();
		esc.execute();
	}
	public void execute() {
		   ScheduledExecutorService execService
		     = Executors.newSingleThreadScheduledExecutor();

		   Future<String> future = execService.schedule(() -> {
		      
		       return "Hello world";
		   }, 1, TimeUnit.SECONDS);
		   System.out.println("hii");

		   ScheduledFuture<?> scheduledFuture = execService.schedule(() -> {
		       
		   }, 1, TimeUnit.SECONDS);
		   System.out.println("hellooo");

		   execService.shutdown();
		}

}
