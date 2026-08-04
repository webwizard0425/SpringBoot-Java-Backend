package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateAlien {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Alien alien = session.find(Alien.class, 101);

        if (alien != null) {

            alien.setAtech("Spring Boot");

            System.out.println("Alien Updated Successfully");
            System.out.println(alien.getAtech());

        } else {

            System.out.println("Alien Not Found");

        }

        transaction.commit();

        session.close();
        factory.close();
    }
}