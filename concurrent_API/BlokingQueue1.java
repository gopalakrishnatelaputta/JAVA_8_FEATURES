package concurrent_API;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlokingQueue1 
{

	public static void main(String[] args) 
	{
		BlockingQueue <String>alph=new ArrayBlockingQueue<>(7);
		try
		{
			alph.put("A");
			alph.put("B");
			alph.put("C");
			alph.put("D");
			alph.put("E");
			alph.put("F");
			alph.put("G");
			System.out.println("Content of Bloking Queue :"+alph);
			//deleting some elements from the queue
			String temp=alph.take();
			System.out.println("The Number Removed is :"+temp);
			  // BlockingQueue after deleting one element   
			System.out.println("Content of Bloking Queue after deleting the element"+alph);
			
			
			
			BlockingQueue<String>alph2=new LinkedBlockingDeque<>();
			
			//Adding elements 
			
			alph2.addAll(alph);
			System.out.println("Contents of Bloking Queue :"+alph);
			System.out.println("Contents of New Bloking Queue :"+alph2);
			//Accessing the Elements in the Queue
			
			String top=alph2.element();
			System.out.println("Top Element is :"+top);
			//Deleting the elements from the Queue
			alph.remove("C");
			alph.remove("D");
			System.out.println("Elementes after Deleting :"+alph);
			
			System.out.println(alph.remainingCapacity());
			
			
			if(alph2.contains("C"))
			{
				System.out.println("Yayy ! Element successfully found");
				
			}
			else
			{
				System.out.println("No such Element Exists in the Queue");
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
