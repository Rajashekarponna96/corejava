package onesix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	String name;
	int sal;

	Employee() {
	}

	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
}

public class HigestSalinEmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("raj", 12);
		Employee e2 = new Employee("shekar", 16);
		List<Employee> employee = Arrays.asList(e1, e2);
		System.out.println(employee);
		//employee.stream().collect(Collectors.counting().get());

	}

}
