package CreateStudent.ReadingRecords;

import org.hibernate.query.Query;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.SQLQuery;
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
        
    	List<Student> studentList = null;
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        
        
        // Retrieve all records from the Student table
//           List<Student> studentList = session.createQuery("FROM Student", Student.class).list();
//           
  //
//           
//           for(Student s: studentList) {
//          	 System.out.println(s.s_id+" "+s.s_name+" "+s.s_course);
//           }
           
           
   //        	This is for only specific row
//          Student s=session.get(Student.class, 1);  //
//           
//           System.out.println(s);
        
        

//        // Corrected HQL query with a condition in the WHERE clause
//        Query<Student> q = session.createQuery("from Student where s_id = :studentId", Student.class);
//        q.setParameter("studentId", 1); // Replace 1 with the actual value you are looking for
//
//        s = q.uniqueResult();
//
//        System.out.println(s);
        
        
        Random r=new Random();
        Scanner scan=new Scanner(System.in);
        
//        for(int i=1;i<=50;i++) {
//        	Student s=new Student();
//        	s.setS_name("Name"+i);
//        	s.setS_course("MCA");
//        	session.save(s);
//        	
//        }
        
        
//        Query<Student> q=session.createQuery("from Student where id<20",Student.class);
//        studentList=q.list();
//        
//        for(Student ss: studentList) {
//        	System.out.println(ss);
//        }
        
//        Query<Student> q=session.createQuery("from Student where id=1",Student.class);
//        Student s=(Student)q.uniqueResult();
//        
//        System.out.println(s);
        
        SQLQuery<Student> query = session.createNativeQuery("SELECT * FROM Student", Student.class);
        studentList = query.list();

        for (Student ss : studentList) {
            System.out.println(ss);
        }
        
        

        // Close the resources
        trans.commit();
        session.close();
        factory.close();
    }
}
