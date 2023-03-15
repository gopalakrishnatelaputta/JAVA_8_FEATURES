package java8Task_15_03_2023;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Customer 
{
	private int id;
	private String FirstName;
	private String LastName;
	public Customer(int id, String firstName, String lastName) {
		
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}
class CustomerDTO
{
	private int id;
	private String FirstName;
	private String LastName;
	public CustomerDTO(int id, String firstName, String lastName) {

		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	
	private static Set<CustomerDTO> BeforeJava8Demo()
	{
		final Set<Customer>customers=new HashSet<>();
		
		customers.add(new Customer (100,"Gopala Krishna","Telaputta"));
		customers.add(new Customer (68,"Rahul","Thripati"));
		customers.add(new Customer (128,"Axar","Patel"));
		customers.add(new Customer (07,"M S","Dhoni"));
		customers.add(new Customer (100,"Virender","Sehwag"));
		customers.add(new Customer (45,"Virat","Kohli"));
		customers.add(new Customer (37,"Dinesh","Karthik"));
		customers.add(new Customer (23,"Rohit","Sharma"));
		
		final Set<CustomerDTO>customerDTOs=new HashSet<>();
		for(Customer customer:customers)
		{
			customerDTOs.add(new CustomerDTO(customer.getId(),customer.getFirstName(),customer.getLastName()));
		}
		
		for(CustomerDTO customerDTO :customerDTOs)
		{
			System.out.println(customerDTO.getId());
		}
		
		return customerDTOs;
	}
	
	private static Set<CustomerDTO> java8StreamAPIDemo(){
		 final Set<Customer> customers = new HashSet<>();
		 customers.add(new Customer(100, "customer", "lastname1"));
		 customers.add(new Customer(200, "customer2", "lastname2"));
		 customers.add(new Customer(300, "customer3", "lastname3"));
		 customers.add(new Customer(400, "customer4", "lastname4"));
		 
		 final Set<CustomerDTO> customerDTOs = customers.stream().map(c ->{
		  final CustomerDTO customerDTO = new CustomerDTO(c.getId(), c.getFirstName(), c.getLastName());
		  return customerDTO;
		 }).collect(Collectors.toSet());

		 customerDTOs.forEach( c -> System.out.println(c.getId()));
		 return customerDTOs;
		}
	
	
}