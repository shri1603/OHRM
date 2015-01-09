import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Retrievedata {

	public void retrieve(SessionFactory factory) {
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("from Timesheet").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	            Timesheet employee = (Timesheet) iterator.next(); 
	            System.out.print( employee.toString()); 
	           
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
}
