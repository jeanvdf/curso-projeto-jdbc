package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
	
	private Integer Id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller() {
	}

	public Seller(Integer id, String nome, String email, Date dataNascimento, Double salarioBase,
			Department department) {
		Id = id;
		this.name = nome;
		this.email = email;
		this.birthDate = dataNascimento;
		this.baseSalary = salarioBase;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date dataNascimento) {
		this.birthDate = dataNascimento;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double salarioBase) {
		this.baseSalary = salarioBase;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Vendedor [Id=" + Id + ", nome=" + name + ", email=" + email + ", dataNascimento=" + birthDate
				+ ", salarioBase=" + baseSalary + ", department=" + department + "]";
	}
	
}
