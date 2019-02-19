package entities;

public class Employee {
	
	public String name;
	public Double salary;
	public Integer id;
	
	public Employee(String name, Double salary, Integer id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public Integer getId() {
		return id;
	}

	public void incraseSalary(double percentage) {
		salary += (salary * percentage) / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
