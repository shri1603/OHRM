import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Retrievedata {

	public static void retrieve() {
		@SuppressWarnings("deprecation")
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Timesheet.class);
		SessionFactory factory = config.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Query queryResult = session.createQuery("from timesheet");
		java.util.List allUsers;
		allUsers = queryResult.list();
		for (int i = 0; i < allUsers.size(); i++) {
			Timesheet user = (Timesheet) allUsers.get(i);
			System.out.println(user.toString());
		}
		System.out.println("Database contents delivered...");
	}

}
