package ManyToMany.com.ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    	Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();



            Course javaCourse = new Course();
            javaCourse.setCourseName("Java Programming");

            Course dbCourse = new Course();
            dbCourse.setCourseName("Database Management");

            Student john = new Student();
            john.setName("John Doe");

            Student jane = new Student();
            jane.setName("Jane Doe");

            // Enroll students in courses
            john.getCourses().add(javaCourse);
            javaCourse.getStudents().add(john);

            john.getCourses().add(dbCourse);
            dbCourse.getStudents().add(john);

            jane.getCourses().add(javaCourse);
            javaCourse.getStudents().add(jane);
            
            
            

            // Save entities
            session.persist(john);
            session.persist(jane);
            session.persist(javaCourse);
            session.persist(dbCourse);

            trans.commit();
        
    }
}
