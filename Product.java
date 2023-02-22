package filtering_using_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product 
{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}

}
 class JavaStreamExample 
{
	public static void main(String[] args) 
	{
		
		List<Product>PL=new ArrayList<Product>();
	PL.add(new Product(1,"HP Laptop",25000f));
	PL.add(new Product(2,"Dell Laptop",28000f));
	PL.add(new Product(1,"Lenovo Laptop",30000f));
	PL.add(new Product(1,"Sony Laptop",35000f));
	PL.add(new Product(1,"Apple Laptop",50000f));
	List<Float>ProductpriceList=PL.stream().filter(p->p.price>30000)
			.map(p->p.price).collect(Collectors.toList());
	System.out.println(ProductpriceList);
	
	}
}
