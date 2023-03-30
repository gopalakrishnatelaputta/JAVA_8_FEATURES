package concurrent_API;

import java.util.concurrent.Semaphore;

public class Shared1
{
	static int count=0;

}
class DemoThread1 extends Thread
{
	//Object of the semaphore Class
		Semaphore semaphore;
		//variable for storing the thread Name
		String threadName;

		public DemoThread1(Semaphore semaphore, String threadName) {
			super(threadName);
			this.semaphore = semaphore;
			this.threadName = threadName;
		}
		@Override
		public void run()
		{
			//run by Thread A
		 
			if(this.getName().equals("A"))
			{
				System.out.println("Staring thread "+threadName);
				try
				{
					//first get a permit
					System.out.println("Waiting for permit");
					//acquiring the lock
					semaphore.acquire();
					System.out.println(threadName+"Gets a permit ");
					/*   
					 * Current thread A is accessing the resource and the 
					 * other threads are waiting for to get the resource
					 * until the thread A release the Lock
					*/
					for(int i=0;i<5;i++)
					{
						Shared1.count++;
						System.out.println(threadName+":"+Shared1.count);
						//now ,allowing a context switch for thread B to execute
						//sleeps thread for 1 second
						
						Thread.sleep(1000);
						
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				//release the permit
				System.out.println("Thread "+threadName+"releases the Permit.");
				semaphore.release();
				
			}
			else
			{
				System.out.println("Starting thread " + threadName);   
				try  
				{   
				//first, get a permit  
				System.out.println("Thread " +threadName + " is waiting for a permit.");   
				//acquiring the lock   
				semaphore.acquire();   
				System.out.println("Thread " +threadName + " gets a permit.");   
				//Now, accessing the shared resource.   
				//other waiting threads will wait, until this   
				//thread release the lock   
				for(int i=0; i < 5; i++)   
				{   
				//decrements the count value      
				Shared1.count--;   
				System.out.println(threadName+":"+ Shared1.count);   
				//Now, allowing a context switch -- if possible.   
				//for thread A to execute   
				//sleeps thread for 1 second  
				Thread.sleep(1000);   
				}   
				}   
				catch (InterruptedException e)   
				{   
				e.printStackTrace();   
				}   
				//release the permit   
				System.out.println("Thread " +threadName + " releases the permit.");   
				//release the resource  
				semaphore.release();   	
			}
		}
}
class SemaphoreAsLock
{
	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore=new Semaphore(1);
		DemoThread1 dt1=new DemoThread1(semaphore, "A");
		DemoThread1 dt2=new DemoThread1(semaphore, "B");
		//Starting both the threads
		dt1.start();
		dt2.start();
		//Waiting Thread A
		dt1.join();
		//Waiting for thread B
		dt2.join();
		
		//After executing the threads the count will be 0 always
		System.out.println("count"+Shared1.count);
	}
}