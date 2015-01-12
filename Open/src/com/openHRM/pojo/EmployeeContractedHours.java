/**
 * 
 */
package com.openHRM.pojo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author fpanchal
 *
 */
public class EmployeeContractedHours {

	private int id ;
	private int empId ;
	private int dayNo ;
	private String cateogry ;
	private Timestamp startTime ;
	private Timestamp endTime ;
    private Timestamp lchStartTime;
    private Timestamp lchEndTime;
    private Date startDate ;
    private Date endDate ;
    private boolean alternateWeek ;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;

	public EmployeeContractedHours() {
		this.id = 0;
		this.empId = 0;
		this.dayNo = 0;
		this.cateogry = null;
		this.startTime = null;
		this.endTime = null;
		this.lchStartTime = null;
		this.lchEndTime = null;
		this.startDate = null;
		this.endDate = null;
		this.alternateWeek = false;
		this.createdBy = null;
		this.createdDate = null;
		this.updatedBy = null;
		this.updatedDate = null;
	}
    /**
	 * @param id
	 * @param empId
	 * @param dayNo
	 * @param cateogry
	 * @param startTime
	 * @param endTime
	 * @param lchStartTime
	 * @param lchEndTime
	 * @param startDate
	 * @param endDate
	 * @param alternateWeek
	 * @param createdBy
	 * @param createdDate
	 * @param updatedBy
	 * @param updatedDate
	 */
	public EmployeeContractedHours(int empId
								 , int dayNo
								 , String cateogry
								 , Timestamp startTime
								 , Timestamp endTime
								 , Timestamp lchStartTime
								 , Timestamp lchEndTime
								 , Date startDate
								 , Date endDate
								 , boolean alternateWeek
								 , String createdBy
								 , Date createdDate
								 , String updatedBy
								 , Date updatedDate) {
		this.empId = empId;
		this.dayNo = dayNo;
		this.cateogry = cateogry;
		this.startTime = startTime;
		this.endTime = endTime;
		this.lchStartTime = lchStartTime;
		this.lchEndTime = lchEndTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.alternateWeek = alternateWeek;
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
	 * @return the dayNo
	 */
	public int getDayNo() {
		return dayNo;
	}
	/**
	 * @param dayNo the dayNo to set
	 */
	public void setDayNo(int dayNo) {
		this.dayNo = dayNo;
	}
	/**
	 * @return the cateogry
	 */
	public String getCateogry() {
		return cateogry;
	}
	/**
	 * @param cateogry the cateogry to set
	 */
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	/**
	 * @return the startTime
	 */
	public Timestamp getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public Timestamp getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the lchStartTime
	 */
	public Timestamp getLchStartTime() {
		return lchStartTime;
	}
	/**
	 * @param lchStartTime the lchStartTime to set
	 */
	public void setLchStartTime(Timestamp lchStartTime) {
		this.lchStartTime = lchStartTime;
	}
	/**
	 * @return the lchEndTime
	 */
	public Timestamp getLchEndTime() {
		return lchEndTime;
	}
	/**
	 * @param lchEndTime the lchEndTime to set
	 */
	public void setLchEndTime(Timestamp lchEndTime) {
		this.lchEndTime = lchEndTime;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the alternateWeek
	 */
	public boolean isAlternateWeek() {
		return alternateWeek;
	}
	/**
	 * @param alternateWeek the alternateWeek to set
	 */
	public void setAlternateWeek(boolean alternateWeek) {
		this.alternateWeek = alternateWeek;
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
