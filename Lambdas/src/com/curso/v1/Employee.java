package com.curso.v1;

public class Employee {
	
	private int id;
	private String nombre;
	private double salary;
	
	public Employee(int id, String nombre, double salary) {
		this.id = id;
		this.nombre = nombre;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", salary=" + salary + "]";
	}
	
	static Employee addSalary(Employee e,double inc) {
		e.setSalary(e.getSalary()*inc);
		return e;
	}
	
	Employee incrementarSalario(double inc) {
		this.setSalary(this.getSalary()*inc);
		return this;
	}

}
