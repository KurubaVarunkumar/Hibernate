package SecondLevelCache.SecondLevelCache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Product p = null;

        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {

            Transaction trans = session.beginTransaction();

            p = session.get(Product.class, 1);

            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check for null before using the Product
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Product with ID 1 not found.");
        }
    }
}
