package com.openHRM.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import com.openHRM.constant.OpenHRMConstants;
import com.openHRM.util.DateUtility;

public class BranchTimings implements Serializable
{
	private int id ;
    private int branchId;
    private int dayNo;
    private Timestamp opTime;
    private Timestamp clTime;
    private Timestamp lchOpTime;
    private Timestamp lchClTime;
    private Date startDate;
    private Date endDate;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public BranchTimings()
    {
    	id = 0 ;
        branchId = 0;
        dayNo = 0;
        opTime = null;
        clTime = null;
        lchOpTime = null;
        lchClTime = null;
		startDate=null;
		endDate=null;
        createdBy = null;
        createdDate = null;
        updatedBy = null;
        updatedDate = null;
    }

    public BranchTimings( int branchId
    					, int dayNo
    					, String opTime
    					, String clTime
    					, String lchOpTime
    					, String lchClTime
    					, Date startDate
    					, Date endDate
    					, String createdBy
    					, Date createdDate
    					, String updatedBy
    					, Date updatedDate)
    	throws ParseException
    {
        this.branchId = branchId;
        this.dayNo = dayNo;
		
        this.opTime = DateUtility.getTimestamp(OpenHRMConstants.TIME_FORMAT_24HR, opTime) ;
        this.clTime = DateUtility.getTimestamp(OpenHRMConstants.TIME_FORMAT_24HR, clTime) ;
        this.lchOpTime = DateUtility.getTimestamp(OpenHRMConstants.TIME_FORMAT_24HR, lchOpTime) ;
        this.lchClTime = DateUtility.getTimestamp(OpenHRMConstants.TIME_FORMAT_24HR, lchClTime) ;

        this.startDate = startDate;
        this.endDate = endDate;

        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    public int getBranchId()
    {
        return branchId;
    }

    public void setBranchId(int branchId)
    {
        this.branchId = branchId;
    }

    public int getDayNo()
    {
        return dayNo;
    }

    public void setDayNo(int dayNo)
    {
        this.dayNo = dayNo;
    }


    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Timestamp getClTime()
    {
        return clTime ;
    }

    public void setClTime(Timestamp clTime) throws ParseException
    {
        this.clTime = clTime;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Timestamp getLchClTime()
    {
        return lchClTime ;
    }

    public void setLchClTime(Timestamp lchClTime) throws ParseException
    {
      this.lchClTime = lchClTime;
    }

    public Timestamp getLchOpTime()
    {
        return lchOpTime ;
    }

    public void setLchOpTime(Timestamp lchOpTime) throws ParseException
    {
        this.lchOpTime = lchOpTime ;
    }

    public Timestamp getOpTime()
    {
        return opTime ;
    }

    public void setOpTime(Timestamp opTime) throws ParseException
    {
        this.opTime = opTime ;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate()
    {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate)
    {
        this.updatedDate = updatedDate;
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
