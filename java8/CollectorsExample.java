package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1
{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class CollectorsExample {
public static void main(String[] args) {
	List<Product1>pl=new ArrayList<>();
	pl.add(new Product1(1,"Samsung",25000));
	pl.add(new Product1(2,"OnePlus+",45000));
	pl.add(new Product1(3,"RealMe",20000));
	pl.add(new Product1(4,"Redmi",12000));
	pl.add(new Product1(5,"I-phone",125000));
	pl.add(new Product1(6,"Sony",75000));
	pl.add(new Product1(7,"Motorola",40000));
	
	List<Float>ppl=pl.stream().map(x->x.price).collect(Collectors.toList());
	System.out.println(ppl);
	System.out.println();
	System.out.println("After averaging the Result");
	Double average=pl.stream().collect(Collectors.averagingDouble(p->p.price));
	System.out.println("Average price is :"+average);
}
}
