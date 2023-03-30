package java8;

import java.util.Optional;

public class OptionalExample 
{
	public static void main(String[] args) {
		String[] str=new String[10];
		//str[5]="GOPALA KRISHNA TELAPUTTA";
		
		//System.out.println(lowercaseString);// GIVES NULL POINTER EXCEPTION.
		//TO DEAL NULL POINTER EXCEPTION IN 1.8 INTRODUCED OPTIONAL CLASS.
		
		
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent())
		{
			String lowercaseString=str[5].toLowerCase();
			System.out.println(lowercaseString);
		}
		else
		{
			System.out.println("String value not present");
		}
		
	}

}
