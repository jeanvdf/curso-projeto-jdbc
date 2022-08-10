package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	private Integer Id;
	private String nome;
	
	public Department () {
	}

	public Department(Integer id, String nome) {
		Id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		this.Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", nome=" + nome + "]";
	}
	
}
