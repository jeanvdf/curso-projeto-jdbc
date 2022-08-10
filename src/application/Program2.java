package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1 Department .. findById ===");
		Department Department = DepartmentDao.findById(3);
		System.out.println(Department);
		
	
		System.out.println("\n=== TEST 2 Department .. findByDepartment ===");
		Department department = new Department(2, null);
		List<Department> list = DepartmentDao.findByDepartment(department);
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3 Department .. findAll ===");
		list = DepartmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4 Department .. insert ===");
		//Department newDepartment = new Department(null, "Music");
		//DepartmentDao.insert(newDepartment);
		//System.out.println("Inserido !! Novo ID = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 5 Department .. update ===");
		Department = DepartmentDao.findById(7);
		Department.setNome("Music");
		DepartmentDao.update(Department);
		System.out.println("Updated Completo.. ID "+ Department.getId() + " Nome " + Department.getNome());
		
		System.out.println("\n=== TEST 6 Department .. delete ===");
		System.out.println("Digite um ID para Deletar ..");
		int id = sc.nextInt();
		DepartmentDao.deleteById(id);
		System.out.println("Delete Completo.");
		
		sc.close();
	}

}
