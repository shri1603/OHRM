
public class Timesheet {

	   private int id;
	   private String EmpName; 
	   private String EmpId;   
	 
    public Timesheet(){}
	  
	   public Timesheet(int id,String Ename,String Eid) {
	      this.id = id;
		  this.EmpName = Ename;
	      this.EmpId=Eid;	     
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Employee ID : ").append(EmpId);
		sb.append(" ,Employee Name : ").append(EmpName);

		return sb.toString();
		}
	
}
