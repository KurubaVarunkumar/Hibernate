package CreateStudent.UpdateStudent;

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
    	Student s1=new Student(1,"Kuruba Varunkumar","MCA");
    	Student s2=new Student(2,"Boya Gangaraj","MCA");
    	Student s3=new Student(3,"Golla Deelip","MCA");
    	Student s4=new Student(4,"Lakkapagarai Kiran","MCA");
    	
    	
    	Configuration cfg = new Configuration().configure();

    	SessionFactory factory = cfg.buildSessionFactory();

    	Session session = factory.openSession();

    	Transaction trans = session.beginTransaction();
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(s4);
    	trans.commit();
        System.out.println( "Update commlited" );
    }
}
