package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class ForEach_StreamAPI 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();
		
		
		al.add(25);
		al.add(65);
		al.add(85);
		al.add(96);
		al.add(58);
		al.add(29);
		al.add(30);
		al.add(47);
		Collections.sort(al);//Sorting
		/*Stream API LIst of Methods :=
		
		1) forEach()
		2) filter()
		3) map()
		4) reduce()
		
		Examples :=
		===========
		Collections.sort(al);//Sorting
		/*Stream<Integer>s=al.stream();//Creating a Stream
		s.forEach(t->System.out.println(t));// Iterating the Stream elements. forEach() method
		*/
		
		
		/*Stream<Integer>s=al.stream();
		Stream<Integer>s2=s.filter(a->a%2==0);       //Adding Filter Concept filter()method
		s2.forEach(a->System.out.println(a));*/
		
		//al.stream().filter(a->a%2==0).forEach(a->System.out.println(a));
        // Combining three Lines.
		
		//al.stream().map(a->a+5).forEach(a->System.out.println(a));// map() method
		
		int x=al.stream().reduce(0,(a,b)->a+b);  // Reduce() method  //it is worked based on Binary Operator. 
		System.out.println(x);
		
	}

}
