package com.hibernate.example;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hibertest {

	private static SessionFactory factory; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	         factory = new Configuration().configure().buildSessionFactory();              
	         //Create a hibernate object for the connection and Mapping to the DB 
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		
		Hibertest objhiber=new Hibertest();
		//String dt="2014-12-14 12:00:00";
		Integer empID1 = objhiber.add(new Date(),123456,"Test","Hibernate");
		objhiber.get();

	}

	public Integer add(Date date,int cuid, String status, String APIName){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         HiberbatePojo objpojo=new HiberbatePojo(date,cuid,status,APIName);
	         employeeID = (Integer) session.save(objpojo); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
	
	public void get( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("from com.hibernate.example.HiberbatePojo").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	        	 HiberbatePojo objpojo=(HiberbatePojo) iterator.next(); 
	            System.out.print("Date: " + objpojo.getPdate() +"\n");
	            System.out.print("cuid:   " + objpojo.getPcuid()+"\n"); 
	            System.out.println(" API_Name  " + objpojo.getpAPIName()+"\n"); 
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
