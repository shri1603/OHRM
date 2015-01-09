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
      
      Updatedata objdataupdate=new Updatedata();
      
      Deletion objdatadelete=new Deletion();
      
      objdatainsert.addEmployee("test123113","tt1603", 3312354, factory);    
      objdataretrieve.retrieve(factory);
      objdataupdate.updateData("Abbas","s1603");
      objdatadelete.delete("s1603");
      
      
   }
 
}