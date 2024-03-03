package test;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.CatDAO;
import model.Cat;
import util.HibernateUtil;

public class TestCat {
	public static void main(String[] args) {
		CatDAO cat_dao = new CatDAO();
		
//		test selectAll
//		List<Cat> list = cat_dao.selectAll();		
//		for(Cat cat: list) {
//			System.out.println(cat);
//		}
		
////		test selectById
//		Cat c = new Cat();
//		c.setId(1);
//		Cat c1 = cat_dao.selectById(c);
//		System.out.println(c1);
		
//		test insert
//		Cat c = new Cat("meo meo qq", new Date(2000-1901,02,10), false);
//		cat_dao.insert(c);
		
//		test update
//		Cat c = new Cat();
//		c.setId(3);
//		c.setName("Tobii");
//		cat_dao.update(c);
		
//		test delete
		Cat c = new Cat();
		c.setId(3);
		cat_dao.delete(c);
		
	}
}
