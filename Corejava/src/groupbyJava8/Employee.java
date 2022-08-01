package groupbyJava8;

public class Employee {
	String name;
	String designation;
	int sal;
	
 Employee() {
	 
	}

	public Employee(String name, String designation, int sal) {
		super();
		this.name = name;
		this.designation = designation;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", sal=" + sal + "]";
	}

}
