import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MEmployee {
   private static SessionFactory factory; 
   
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      InsertData objdatainsert = new InsertData();
      
      Retrievedata objdataretrieve= new Retrievedata();
      
      objdatainsert.addEmployee("Shridhar","s1603", 12354, factory);    
      objdataretrieve.retrieve();        
   }
 
}