package concurrent_API;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecuterNewCachedThreadPool 
{
    public static void main(String[] args)throws InterruptedException {
		ExecutorService exser=Executors.newCachedThreadPool();
		ThreadPoolExecutor mypool=(ThreadPoolExecutor)exser;
		System.out.println("Size of MyPool :"+mypool.getPoolSize());
		exser.submit(new Threadimpl());
		exser.submit(new Threadimpl());
		System.out.println("Total Number of Threads Scheduled  :" + mypool.getTaskCount());
		exser.shutdown();
	}
   
    

}
class Threadimpl implements Runnable
{

	@Override
	public void run() {
		try
		{
			Long num=(long) (Math.random()/30);
			System.out.println("Thread Name :"+Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(num);
			System.out.println("After sleep Thread Name   :"+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
