package edu.mum.cs.cs425.lesson10.jpademoapp;

import edu.mum.cs.cs425.lesson10.jpademoapp.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App {

    private static final String PERSISTENCE_UNIT_NAME = "edu.mum.cs.cs425.lesson10.jpademoapp.model.Account";
    private static EntityManagerFactory factory;

    public App() {
        factory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = factory.createEntityManager();
        entitymanager.getTransaction().begin();
    }

    public static void main(String[] args) {
        App app = new App();

        Account a = new Account();
        a.setAccountno("000-98-0004");
        a.setAccountname("David Lynch");

        app.saveAccount(a);
    }

    private static List<Account> readAccounts() {
        return null;
    }

    private void saveAccount(Account a) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
    }

}
