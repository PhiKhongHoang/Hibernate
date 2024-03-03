package dao;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Cat;
import util.HibernateUtil;

public class TestCat_2 {
	public static void main(String[] args) {
//		transient
		Cat cat = new Cat("meo meo ne", new Date(System.currentTimeMillis()), false);
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
//				persistent
				session.save(cat);
				tr.commit();
				
//				detached => persistent
				session.refresh(cat);
				
				session.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
