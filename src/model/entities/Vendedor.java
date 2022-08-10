package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedor implements Serializable {
	
	private Integer Id;
	private String nome;
	private String email;
	private Date dataNascimento;
	private Double salarioBase;
	
	private Department department;
	
	public Vendedor() {
	}

	public Vendedor(Integer id, String nome, String email, Date dataNascimento, Double salarioBase,
			Department department) {
		Id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.salarioBase = salarioBase;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
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
		Vendedor other = (Vendedor) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Vendedor [Id=" + Id + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", salarioBase=" + salarioBase + ", department=" + department + "]";
	}
	
}
