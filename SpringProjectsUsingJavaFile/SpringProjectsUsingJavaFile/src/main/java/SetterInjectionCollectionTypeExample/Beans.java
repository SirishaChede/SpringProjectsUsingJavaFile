package SetterInjectionCollectionTypeExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	@Bean
	public Employee emp1() {
		Employee emp=new Employee();
		emp.setName("siri");
		emp.setPosition("intern");
		emp.setSalary(2000);
		return emp;
		
	}
	@Bean
	public Employee emp2() {
		Employee emp=new Employee();
		emp.setName("mani");
		emp.setPosition("associate");
		emp.setSalary(3000);
		return emp;

}
	@Bean
	public Employee emp3() {
		Employee emp=new Employee();
		emp.setName("kala");
		emp.setPosition("teamlead");
		emp.setSalary(10000);
		return emp;
}
	
	@Bean
	   public Department Depart() {
		Department d=new Department();
		d.setName("software");
		List<Employee>emp=new ArrayList();
		emp.add(emp1());
		emp.add(emp2());
		emp.add(emp3());
		d.setEmployees(emp);
		return d;
		
		
		
	}
}
