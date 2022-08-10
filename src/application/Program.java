package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		Vendedor vendedor = new Vendedor(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		System.out.println(obj);
		System.out.println(vendedor);
	}

}
