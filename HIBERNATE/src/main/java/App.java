import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		s1.setName("baby");
		s1.setArtist("justin beiber");

		Session s = sf.openSession();
		s.beginTransaction();

		s.save(s1);
		s.getTransaction().commit();

	}

}
