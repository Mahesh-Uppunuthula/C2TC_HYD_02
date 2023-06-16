import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class);
		SessionFactory sf = config.buildSessionFactory();

		Song s1 = new Song();
		/**
		 * since ID is an auto-increment attribute, we don't have to add it manually.
		 * s1.setId(2);
		 */
		s1.setName("High");
		s1.setArtist("Chain Smokers");

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		s.persist(s1);
		tx.commit();

	}

}
