package SessionJava8Practice;

import java.util.Arrays;
import java.util.List;

public class MethodReference 
{
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		numbers.forEach(x -> System.out.println(x)); //Without Method Reference
	
		//numbers.forEach(System.out::println); With Method Reference
	
	}
	
	
	

}
