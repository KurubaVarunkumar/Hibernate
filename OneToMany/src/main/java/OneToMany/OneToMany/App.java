package OneToMany.OneToMany;

import java.util.*;

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
    	
    	
    	Employee e1=new Employee();
    	Employee e2=new Employee();
    	Employee e3=new Employee();
    	Employee e4=new Employee();
    	Employee e5=new Employee();
    	
    	
    	List<Employee> employee1=new ArrayList<>();
    	List<Employee> employee2=new ArrayList<>();
    	
    	employee1.add(e1);
    	employee1.add(e2);
    	employee1.add(e3);
    	employee2.add(e4);
    	employee2.add(e5);
    	
    	Department d1=new Department(1,"Sales",employee1);
    	Department d2=new Department(2,"Education",employee2);
    	
    	
    	e1.setEmp_id(1);
    	e1.setName("Kuruba Varunkumar");
    	e1.setDepartment(d1);
    	
    	
    	e2.setEmp_id(2);
    	e2.setName("Chintakayala Gangaraju");
    	e2.setDepartment(d2);
    	
    	e3.setEmp_id(3);
    	e3.setName("LakkapaGari Kirankumar");
    	e3.setDepartment(d1);
    	
    	e4.setEmp_id(4);
    	e4.setName("Shiek Samiulla");
    	e4.setDepartment(d2);
    	
    	e5.setEmp_id(5);
    	e5.setName("Boya Anji");
    	e5.setDepartment(d1);
    	
    	Configuration cfg = new Configuration().configure();

    	SessionFactory factory = cfg.buildSessionFactory();

    	Session session = factory.openSession();

    	Transaction trans = session.beginTransaction();
    	
//    	Department d=new Department();
//    	d.setDept_name("Sales");
//    	d.setDept_name("edu");
//    	d.setDept_name("Coding");
//    	d.setDept_name("Counting");
    	
    	session.save(d1);
    	session.save(d2);
    	
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.save(e4);
    	session.save(e5);
    	
    	
    	
    	
    	
    	
    	
    	trans.commit();
    	System.out.println("Completed");
    }
}
