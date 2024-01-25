package CreateStudent.DeleteStudentRecord;
//Import the Student class
import CreateStudent.DeleteStudentRecord.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 // Create a configuration object and configure Hibernate
        Configuration configuration = new Configuration().configure();
     // Build a session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a new session
        try (Session session = sessionFactory.openSession()) {
            // Begin a transaction
            Transaction transaction = session.beginTransaction();

            // Prompt user to enter the record id to be deleted
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the record ID to delete:");
            int id = scan.nextInt();

            // Retrieve the entity by ID
            Student studentToDelete = session.get(Student.class, id);

            // Check if the entity exists
            if (studentToDelete != null) {
                // Delete the entity
                session.delete(studentToDelete);

                // Commit the transaction
                transaction.commit();
                System.out.println("Record with ID " + id + " deleted successfully.");
            } else {
                System.out.println("Record with ID " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}