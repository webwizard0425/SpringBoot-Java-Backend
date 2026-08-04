package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteAlien {
// update db using hibernate
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Find the Alien by primary key
        Alien alien = session.find(Alien.class, 101);

        if (alien != null) {

            // Delete the managed entity
            session.remove(alien);

            System.out.println("Alien deleted successfully.");

        } else {

            System.out.println("Alien not found.");

        }

        transaction.commit();

        session.close();
        factory.close();
    }
}