package SetterInjectionCollectionTypeExample;

import java.util.List;

public class Department {
	
	private String name;
	private List<Employee> employees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void Display() {
		System.out.println("DepartmentName:"+name);
		if(employees!=null) {
			System.out.println("employees in the list");
		for(Employee emp:employees) {
			System.out.println("name:"+emp.getName());
			System.out.println("position:"+emp.getPosition());
			System.out.println("salary:"+emp.getSalary());
		}
			
		}
		else {
			System.out.println("there is no employees");
			
			
		}
	}

}
