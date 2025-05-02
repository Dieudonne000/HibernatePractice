package com.models;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student st = new Student();
		NameDetails names = new NameDetails();
		Laptop laptop = new Laptop();
		Laptop laptop1 = new Laptop();
		List<Laptop> laptopList = new ArrayList<>();
		laptopList.add(laptop);
		laptopList.add(laptop1);
		names.setFirstName("James");
		names.setLastName("Brown");
		st.setNames(names);
		laptop.setLapDesc("LENOVO ThinkBook");
		laptop1.setLapDesc("HP");
		st.setLaptop(laptopList);
		session.persist(st);
		session.persist(laptopList);
		tx.commit();
		session.close();

	}

}
