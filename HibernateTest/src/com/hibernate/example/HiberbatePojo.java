package com.hibernate.example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "api_success")
public class HiberbatePojo {
	
	   private Date pdate;
	   private int pcuid;
	   private String pstatus; 
	   private String pAPIName;
	
	public HiberbatePojo()
	{
		
	}
	
	public HiberbatePojo(Date date,int cuid,String status,String APIName)
	{
		this.pdate = date;
		this.pcuid = cuid;
		this.pstatus = status;
		this.pAPIName = APIName;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public int getPcuid() {
		return pcuid;
	}

	public void setPcuid(int pcuid) {
		this.pcuid = pcuid;
	}

	public String getPstatus() {
		return pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	public String getpAPIName() {
		return pAPIName;
	}

	public void setpAPIName(String pAPIName) {
		this.pAPIName = pAPIName;
	}

}
