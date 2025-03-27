package constructorInjectionExample;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Beans {
	
	
	public Custo Cust() {
		//return new Custo("ggff", 0, "hfgfg", "hcfvhg"); (or)
		Custo cust=new Custo("ggff", 0, "hfgfg", "hcfvhg");// we can follow above or in this one 
		return cust;
	}
	
	public Order ord() {
		//return new Order("cdhbhg", "chhgvhfvg", new Date(), Cust());(or)
		Order ord=new Order("cdhbhg", "chhgvhfvg", new Date(), Cust());
		return ord;// we can follow above model or in this model
	}
}
	 


