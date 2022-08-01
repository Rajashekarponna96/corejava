package groupbyJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// List<Employee> emp = new ArrayList<Employee>();
		
		Employee e1 = new Employee("raj", "UI DEV", 1);
		Employee e2 = new Employee("ram", "JAVA DEV", 2);
		Employee e3 = new Employee("anji", "JAVA DEV", 3);
		Employee e4 = new Employee("Thanuja", "DB DEV", 4);
		Employee e5 = new Employee("Shalini", "DB DEV", 5);
		Employee e6 = new Employee("sagar", "UI DEV", 6);
		List<Employee> employee = Arrays.asList(e1, e2, e3, e4, e5,e6);
//		employee.stream().
//		collect(Collectors.groupingBy(Employee::getDesignation));
//		
		Map<String, List<Employee>> collect = employee.stream()
				.collect(Collectors.groupingBy(Employee::getDesignation));
		System.out.println(collect);
		
		 collect.forEach((key, value) -> System.out.println("Designation:" + key +
		 "Employee" + value));
		 System.out.println(collect);

	}

}
