


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Deletion {
	
	public void delete(String searchId)
	{
	 AnnotationConfiguration config = new AnnotationConfiguration();
	        config.addAnnotatedClass(Timesheet.class);
	        config.configure("hibernate.cfg.xml");
	       
	        SessionFactory factory = config.buildSessionFactory();
	             
	        //beginning of the session
	        Session session = factory.openSession();
	        session.beginTransaction();//beginning of the transaction
	       

	       
	        //create the delete query
	        String query = "delete from Timesheet as p where p.EmpId = :key";
	       
	        session.createQuery(query).setString("key", searchId).executeUpdate();
	        
	        session.getTransaction().commit();//end of transaction
	        session.close();//end of  session
	}
	        
}