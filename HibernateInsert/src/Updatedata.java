
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Updatedata {
	 public void updateData(String name,String id)
	 {
		 AnnotationConfiguration config = new AnnotationConfiguration();
	        config.addAnnotatedClass(Timesheet.class);
	        config.configure("hibernate.cfg.xml");
	       
	        SessionFactory factory = config.buildSessionFactory();
	             
	        //beginning of the session
	        Session session = factory.openSession();
	        session.beginTransaction();//beginning of the transaction
	       
	      
	       
	        //create the update query
	        String query = "update Timesheet as p set p.EmpName = :newName where p.EmpId = :keyId";
	       
	        session.createQuery(query)
	            .setString("newName", name)//this will set the string 'newName' to name variable
	            .setString("keyId", id)
	            .executeUpdate();
	        
	        session.getTransaction().commit();//end of transaction
	        session.close();//end of  session
	       
	       
	        }
	 }
