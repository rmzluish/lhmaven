package com.testlh.lhmaventest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonFullName personfullname = new PersonFullName();
        personfullname.setFirstName("LUIS HEVEO");
        personfullname.setMiddleName("RAMIREZ");
        personfullname.setLastName("MARTINEZ");
        
        Laptop laptop = new Laptop();
        laptop.setIdLaptop(3);
        laptop.setBrand("thinkpad");
        laptop.setDescripcion("My new Laptop again");
        
        Laptop laptop2 = new Laptop();
        laptop2.setIdLaptop(4);
        laptop2.setBrand("thinkpad");
        laptop2.setDescripcion("My new Laptop again");

    	Person person = new Person();
    	person.setId(2);
    	person.setAge(2);
    	person.setName(personfullname);
    	person.getLaptop().add(laptop);
    	person.getLaptop().add(laptop2);

    	Configuration con 	= new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf 	= con.buildSessionFactory(reg);
 
    	Session session  	= sf.openSession();
    	
    	Transaction tx 		= session.beginTransaction();

    	session.save(laptop);
    	session.save(laptop2);
    	session.save(person);
    	
    	person = (Person) session.get(Person.class, 1);
    	
    	tx.commit();
    	
    	System.out.print( person  );

    }
}
