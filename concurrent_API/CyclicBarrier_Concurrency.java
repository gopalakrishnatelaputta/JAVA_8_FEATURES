package concurrent_API;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_Concurrency 
{
	public static void main(String[] args) 
	{
		// Creating a Constructor of the Cyclic Barrier class 
		CyclicBarrier cb=new CyclicBarrier(3, new AfterAction());
		//initializing three threads to read 3 different files
		Thread t1=new Thread(new Thread(new TxtReader("thread-1","file-1",cb)));
		Thread t2=new Thread(new Thread(new TxtReader("thread-2","file-2",cb)));
		Thread t3=new Thread(new Thread(new TxtReader("thread-3","file-3",cb)));
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Done");

		
		// REUSE CYCLIC BARRIER
		
		//System.out.println("REUSE CYCLIC BARRIER ");
		
		System.out.println("Start another set of threads ");  
		Thread t4 = new Thread(new TxtReader("T-4", "demo4", cb));  
		Thread t5 = new Thread(new TxtReader("T-5", "demo5", cb));  
		Thread t6 = new Thread(new TxtReader("T-6", "demo6", cb));  
		//start execution of threads  
		t4.start();  
		t5.start();  
		t6.start(); 
		
	}

}
class TxtReader implements Runnable 
{
	private String threadName;
	private String fileName;
	private CyclicBarrier cb;
	public TxtReader(String threadName, String fileName, CyclicBarrier cb) {
		super();
		this.threadName = threadName;
		this.fileName = fileName;
		this.cb = cb;
	}
	@Override
	public void run()
	{
		System.out.println("Reading file "+fileName+"  "+"thread -"+threadName);
		try
		{
			cb.await();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
class AfterAction implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("In after class ,start further processing as all files are read");
	}
}


