package concurrent_API;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecuterPrevilizedThreadFactory 
{
	public static void main(String[] args) {
		ThreadFactory tf=Executors.defaultThreadFactory();
		Thread t=tf.newThread(new Mythrd3());
		t.start();
	}

}
class Mythrd3 implements Runnable 
{
	@Override
	public void run()
	{
		System.out.println("Running Thread Concurrently ");
	}
}
