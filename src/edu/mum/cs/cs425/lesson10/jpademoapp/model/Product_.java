package edu.mum.cs.cs425.lesson10.jpademoapp.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@Generated(value = "Dali", date = "2018-06-06T17:00:39.572-0500")
@StaticMetamodel(Product.class)
public class Product_ {


    public static volatile SingularAttribute<Product, Long> pid;
    public static volatile SingularAttribute<Product, Long> productNumber;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Double> unitPrice;
    public static volatile SingularAttribute<Product, Date> dateMdf;
}
