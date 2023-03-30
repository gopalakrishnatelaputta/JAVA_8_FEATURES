package SessionJava8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerClasssss
{
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Rahul");
		list.add("raju");
		list.add("Raheem");
		
		System.out.println(list);
		
		StringJoiner joinNames=new StringJoiner(",");
		joinNames.add("Ravi");
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Raheem");
		
		System.out.println();
		System.out.println(joinNames);
	}

}
