package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Department department;
		List<Seller> list;
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		//System.out.println("=== TEST 1: seller findById =====");
		
	//	System.out.println(seller);
		
//		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		department = new Department(2, null);
//		list = sellerDao.findByDepartment(department);
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

//		System.out.println("\n=== TEST 4: seller insert =====");
//		Seller newSeller = new Seller(null, "Amanda", "amanda@gmail.com", new Date(), 500.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
//		System.out.println("\n=== TEST 5: seller update =====");
//		seller = sellerDao.findById(2);
//		seller.setName("Flavinha te amo DEMAIS");
//		sellerDao.update(seller);
//		System.out.println("Update completed");
		
		
		sc.close();
	}
}
