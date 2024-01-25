package OneToOneStudent.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration configuration = new Configuration().configure();
    	 
    	 try (SessionFactory sessionFactory = configuration.buildSessionFactory();
                 Session session = sessionFactory.openSession()) {

                Transaction transaction = session.beginTransaction();
                Address address=new Address();
                Person person=new Person(1,"Kuruba Varunkumar",address);
//                person.setName("Kuruba Varunkumar");
                
                
                
                address.setStreet("Bc colony Peddakowkuntla");
                
//                person.setAddress(address);
//                address.setPerson(person);
                session.save(person);
                session.save(address);
                transaction.commit();
                System.out.println("Object is saved");
    }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
}}
