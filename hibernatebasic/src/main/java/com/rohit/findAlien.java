package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class findAlien {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Alien alien = session.find(Alien.class, 101);

        if (alien != null) {
            System.out.println("ID   : " + alien.getAid());
            System.out.println("Name : " + alien.getAname());
            System.out.println("Tech : " + alien.getAtech());
        } else {
            System.out.println("Alien not found.");
        }

        session.close();
        factory.close();
    }
}