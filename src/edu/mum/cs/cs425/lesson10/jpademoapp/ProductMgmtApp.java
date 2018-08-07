package edu.mum.cs.cs425.lesson10.jpademoapp;

import edu.mum.cs.cs425.lesson10.jpademoapp.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

public class ProductMgmtApp {

    private static final String PERSISTENCE_UNIT_NAME = "Eclipselink_JPA";
    private static EntityManagerFactory factory;

    public ProductMgmtApp() {
        factory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entitymanager = factory.createEntityManager();
        entitymanager.getTransaction().begin();
    }

    public static void main(String[] args) {
        ProductMgmtApp app = new ProductMgmtApp();
        Product a = new Product();
        a.setName("Iphone X");
        a.setUnitPrice(1000.0);
        Integer longvalue=1001;
        a.setPid(longvalue.longValue());


        Date date = new Date(2017, 12, 1);

        a.setDateMdf(date);
        app.saveProduct(a);
    }

    private static List<Product> readProducts() {
        return null;
    }

    private void saveProduct(Product a) {
        EntityManager em = factory.createEntityManager();

    em.getTransaction().begin();
    em.persist(a);
    em.getTransaction().commit();
    em.close();
    }

}
