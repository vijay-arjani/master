package service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.DbConnection;
import com.domain.UserActivity;
import com.domain.UserRole;

@SuppressWarnings("deprecation")
public class Card {

	public static void save() {
		UserRole role = new UserRole("raju", "discription ", 2, "1:37", "rental", "14:25");
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();

		session.save(role);
		session.beginTransaction().commit();

	}

	public static void delete() {
		UserRole role = new UserRole(4);
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();
		role.setId(role.getId());
		session.delete(role);
		session.beginTransaction().commit();
	}

// 	 public static void update() {
// 		 UserRole role =new  UserRole(4);
// 	 SessionFactory factory = DbConnection.getSessionFectory();
// 	 Session session =factory.openSession();
// 	
// 	 session.saveOrUpdate();
// 	 }
	public static List getAllData() {

		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();

		session.beginTransaction();

		Query query = session.createQuery("from UserRole");
		List<UserRole> list = query.list();

		for (UserRole role : list) {
			System.out.println("list" + role);

		}
		return list;

	}

	public static void getDataById(int getid) {
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();

		int id1 = getid;
		UserRole role = session.get(UserRole.class, id1);
		System.out.println("role=" + role);

	}

	public static void updataData() {
		SessionFactory factory = DbConnection.getSessionFectory();
		Session session = factory.openSession();

		UserRole s = new UserRole("Vinay", "discription ", 10, "10:30", "owner", "14:25");
		session.beginTransaction();
		session.saveOrUpdate(s);
		session.getTransaction().commit();
		session.close();
	}

}
