package java8Task_15_03_2023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapTest
{
	public static void main(String[] args) 
	{
		final Set<Customer> customers = new HashSet<>();
		customers.add(new Customer (100,"Gopala Krishna","Telaputta"));
		customers.add(new Customer (68,"Rahul","Thripati"));
		customers.add(new Customer (128,"Axar","Patel"));
		customers.add(new Customer (07,"M S","Dhoni"));
		customers.add(new Customer (100,"Virender","Sehwag"));
		customers.add(new Customer (45,"Virat","Kohli"));
		customers.add(new Customer (37,"Dinesh","Karthik"));
		customers.add(new Customer (23,"Rohit","Sharma"));
		  
		  final Set<CustomerDTO> customerDTOs = 
		   customers.stream().map(c ->{
		   final CustomerDTO customerDTO = 
		   new CustomerDTO(c.getId(), c.getFirstName(), c.getLastName());
		   return customerDTO;
		  }).collect(Collectors.toSet());
		 System.out.println("List According to the Id's");
		 System.out.println();
		  customerDTOs.forEach( c -> System.out.println(c.getId()));   
		
		System.out.println("=============================================================");
		
		System.out.println("List According to the FirstNames ");
		System.out.println();
		  // Convert entity to DTO using List
		  final List<Customer> list = new ArrayList<>();
		  list.add(new Customer (100,"Gopala Krishna","Telaputta"));
		  list.add(new Customer (68,"Rahul","Thripati"));
		  list.add(new Customer (128,"Axar","Patel"));
		  list.add(new Customer (07,"M S","Dhoni"));
		  list.add(new Customer (100,"Virender","Sehwag"));
		  list.add(new Customer (45,"Virat","Kohli"));
		  list.add(new Customer (37,"Dinesh","Karthik"));
		  list.add(new Customer (23,"Rohit","Sharma"));
		  
		  final List<CustomerDTO> dtos = list.stream().map(c ->{
		   final CustomerDTO customerDTO = 
		   new CustomerDTO(c.getId(), c.getFirstName(), c.getLastName());
		   return customerDTO;
		  }).collect(Collectors.toList());
		 
		  dtos.forEach( c -> System.out.println(c.getFirstName()));
		 }
		 
		 
		 private static Set<CustomerDTO> BeforeJava8Demo(){
		  final Set<Customer> list1 = new HashSet<>();
		  list1.add(new Customer (100,"Gopala Krishna","Telaputta"));
		  list1.add(new Customer (68,"Rahul","Thripati"));
		  list1.add(new Customer (128,"Axar","Patel"));
		  list1.add(new Customer (07,"M S","Dhoni"));
		  list1.add(new Customer (100,"Virender","Sehwag"));
		  list1.add(new Customer (45,"Virat","Kohli"));
		  list1.add(new Customer (37,"Dinesh","Karthik"));
		  list1.add(new Customer (23,"Rohit","Sharma"));
		  final Set<CustomerDTO> customerDTOs = new HashSet<>();
		  for(Customer customer : list1){
		   customerDTOs.add(new CustomerDTO(customer.getId(),
		   customer.getFirstName(),customer.getLastName()));
		  }
		  System.out.println("=============================================================");
			
			System.out.println("List According to the LastNames ");
			System.out.println();
		  
		  for(CustomerDTO customerDTO : customerDTOs){
		   System.out.println(customerDTO.getLastName());
		  }
		  return customerDTOs;
		 }
		 
		 private static Set<CustomerDTO> java8StreamAPIDemo(){
		  final Set<Customer> list2 = new HashSet<>();
		  list2.add(new Customer (100,"Gopala Krishna","Telaputta"));
		  list2.add(new Customer (68,"Rahul","Thripati"));
		  list2.add(new Customer (128,"Axar","Patel"));
		  list2.add(new Customer (07,"M S","Dhoni"));
		  list2.add(new Customer (100,"Virender","Sehwag"));
		  list2.add(new Customer (45,"Virat","Kohli"));
		  list2.add(new Customer (37,"Dinesh","Karthik"));
		  list2.add(new Customer (23,"Rohit","Sharma"));
		  
		  final Set<CustomerDTO> customerDTOs = list2.stream().map(c ->{
		   final CustomerDTO customerDTO = new CustomerDTO(c.getId(),
		   c.getFirstName(), c.getLastName());
		   return customerDTO;
		  }).collect(Collectors.toSet());
		 
		  customerDTOs.forEach( c -> System.out.println(c.getLastName()));
		  return customerDTOs;
		 }
		
		
	}


