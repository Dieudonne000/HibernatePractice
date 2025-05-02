package com.models;

import com.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Car car = new Car();
        car.setManufacturer("Benz");
        car.setNumOfDoors(5);
        Bike bike = new Bike();
        bike.setManufacturer("Samsung");
        bike.setHasCarrier(true);

        session.persist(car);
        session.persist(bike);
        tx.commit();
        session.close();
    }
}
