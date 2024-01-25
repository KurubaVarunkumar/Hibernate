package CreateTable.CreateTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Create the SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create a session
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Create the table by saving an instance of the entity
        Category entity1 = new Category();
        // Set values for the entity if needed
        Product entity2 = new Product();
        session.save(entity1);
        session.save(entity2);

        // Commit the transaction and close the session
        session.getTransaction().commit();
        session.close();
        System.out.println("create the table");
    }
}
