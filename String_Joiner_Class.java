package java8;

import java.util.StringJoiner;



public class String_Joiner_Class 
{
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",","[", "]");
		
	     sj.add("Rahul");
	     sj.add("Raju");
	     System.out.println(sj);
	     
	     StringJoiner js1=new StringJoiner(":","[","]");
	     js1.add("Peter");
	     js1.add("Raheem");
	     System.out.println(sj);
	      int length=js1.length();
	      System.out.println("Length is :"+length);
	      
	      StringJoiner merge=sj.merge(js1);
	      System.out.println(merge);
	      int length1=merge.length();
	      System.out.println("Length is :"+length1);
	}

}
