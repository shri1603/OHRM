/**
 * 
 */
package com.openHRM.pojo;

import java.util.Date;

/**
 * @author fpanchal
 *
 */
public class EmployeeActualHours {

	private int id ;
	private int empId ;
	private int branchId ;
	private int echId ;
	private Date actionDate ;
	private double contractedHrs ;
	private double holidayHrs ;
	private double sickHrs ;
	private double overtimeHrs ;
	private double deductionHrs ;
	private String comments ;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

    public EmployeeActualHours() {
    	this.id = 0;
    	this.empId = 0;
    	this.branchId = 0;
    	this.echId = 0;
    	this.actionDate = null;
    	this.contractedHrs = 0;
    	this.holidayHrs = 0;
    	this.sickHrs = 0;
    	this.overtimeHrs = 0;
    	this.deductionHrs = 0;
    	this.comments = null;
    	this.createdBy = null;
    	this.createdDate = null;
    	this.updatedBy = null;
    	this.updatedDate = null;
    }
    /**
	 * @param id
	 * @param empId
	 * @param branchId
	 * @param echId
	 * @param actionDate
	 * @param contractedHrs
	 * @param holidayHrs
	 * @param sickHrs
	 * @param overtimeHrs
	 * @param deductionHrs
	 * @param comments
	 * @param createdBy
	 * @param createdDate
	 * @param updatedBy
	 * @param updatedDate
	 */
	public EmployeeActualHours(int empId
							 , int branchId
							 , int echId
							 , Date actionDate
							 , double contractedHrs
							 , double holidayHrs
							 , double sickHrs
							 , double overtimeHrs
							 , double deductionHrs
							 , String comments
							 , String createdBy
							 , Date createdDate
							 , String updatedBy
							 , Date updatedDate) {
		this.empId = empId;
		this.branchId = branchId;
		this.echId = echId;
		this.actionDate = actionDate;
		this.contractedHrs = contractedHrs;
		this.holidayHrs = holidayHrs;
		this.sickHrs = sickHrs;
		this.overtimeHrs = overtimeHrs;
		this.deductionHrs = deductionHrs;
		this.comments = comments;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
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
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the branchId
	 */
	public int getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the echId
	 */
	public int getEchId() {
		return echId;
	}
	/**
	 * @param echId the echId to set
	 */
	public void setEchId(int echId) {
		this.echId = echId;
	}
	/**
	 * @return the actionDate
	 */
	public Date getActionDate() {
		return actionDate;
	}
	/**
	 * @param actionDate the actionDate to set
	 */
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	/**
	 * @return the contractedHrs
	 */
	public double getContractedHrs() {
		return contractedHrs;
	}
	/**
	 * @param contractedHrs the contractedHrs to set
	 */
	public void setContractedHrs(double contractedHrs) {
		this.contractedHrs = contractedHrs;
	}
	/**
	 * @return the holidayHrs
	 */
	public double getHolidayHrs() {
		return holidayHrs;
	}
	/**
	 * @param holidayHrs the holidayHrs to set
	 */
	public void setHolidayHrs(double holidayHrs) {
		this.holidayHrs = holidayHrs;
	}
	/**
	 * @return the sickHrs
	 */
	public double getSickHrs() {
		return sickHrs;
	}
	/**
	 * @param sickHrs the sickHrs to set
	 */
	public void setSickHrs(double sickHrs) {
		this.sickHrs = sickHrs;
	}
	/**
	 * @return the overtimeHrs
	 */
	public double getOvertimeHrs() {
		return overtimeHrs;
	}
	/**
	 * @param overtimeHrs the overtimeHrs to set
	 */
	public void setOvertimeHrs(double overtimeHrs) {
		this.overtimeHrs = overtimeHrs;
	}
	/**
	 * @return the deductionHrs
	 */
	public double getDeductionHrs() {
		return deductionHrs;
	}
	/**
	 * @param deductionHrs the deductionHrs to set
	 */
	public void setDeductionHrs(double deductionHrs) {
		this.deductionHrs = deductionHrs;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
