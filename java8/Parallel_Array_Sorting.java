package java8;

import java.util.Arrays;

public class Parallel_Array_Sorting 
{
	public static void main(String[] args) 
	{
		int [] arr= {64,83,54,92,35,-784,-54,-75,-43};
		System.out.println("Before Sorting the Elements  :");
		for(int i:arr)
		{
			System.out.println(i+"  ");
		}
		Arrays.parallelSort(arr);
		System.out.println("=============================================");
		System.out.println("After Sorting the Elements :");
		for(int i:arr)
		{
			System.out.println(i+"  ");
		}
		
	}

}
