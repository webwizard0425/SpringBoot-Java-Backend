package com.rohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Harsh");
        a1.setAtech("Spring");

//        Configuration config =

        SessionFactory factory = new Configuration()
                                .addAnnotatedClass(com.rohit.Alien.class)
                                .configure()
                                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        session.close();
        factory.close();
    }
}