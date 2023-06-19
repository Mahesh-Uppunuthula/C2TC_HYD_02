import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	static Scanner sc = new Scanner(System.in);
	static Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class);
	static SessionFactory sf = config.buildSessionFactory();
	static Session session = sf.openSession();
	static Transaction tx = session.beginTransaction();

	public static void main(String[] args) {

		try {
			while (true) {
				System.out
						.println("Enter option number to perform operation\n1.Create 2.Read 3.Update 4.Delete 5.Exit");
				int optionNum = sc.nextInt();
				if (optionNum == 5)
					break;
				performOperation(optionNum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tx.commit();
			sc.close();
		}

	}

	static void performOperation(int i) {
		switch (i) {
		case 1:
			create();
			break;
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		default:
			throw new IllegalArgumentException("invalid input");
		}

	}

	static void create() {
		System.out.println("\n--------CREATE---------");
		System.out.println("enter song details");
		System.out.print("id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("\nname : ");
		String name = sc.nextLine();
		System.out.print("\nartist : ");
		String artist = sc.nextLine();
		Song newSong = new Song(id, name, artist);
		session.persist(newSong);
	}

	static void read() {
		System.out.println("\n----------READ---------");
		System.out.println("enter id to retrieve song details");
		System.out.print("id : ");
		int id = sc.nextInt();

		Song queriedSong = session.get(Song.class, id);
		System.out.println(queriedSong);
	}

	static void update() {
		System.out.println("\n----------UPDATE---------");
		System.out.print("enter song id : ");
		int id = sc.nextInt();
		System.out.println("select one out of [1.name 2.artist]");
		int opt = sc.nextInt();

		sc.nextLine();
		Song songToUpdate = session.get(Song.class, id);
		if (opt == 1) {
			System.out.print("name : ");
			String name = sc.nextLine();
			songToUpdate.setName(name);
		} else {
			System.out.print("artist : ");
			String artist = sc.nextLine();
			songToUpdate.setArtist(artist);
		}
	}

	static void delete() {
		System.out.println("\n----------DELETE---------");
		System.out.print("enter song id : ");
		int id = sc.nextInt();
		Song songToDelete = session.get(Song.class, id);
		session.remove(songToDelete);
	}

}
