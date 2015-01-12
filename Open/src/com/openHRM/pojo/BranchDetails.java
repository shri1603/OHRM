/**
 * 
 */
package com.openHRM.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fpanchal
 *
 */
public class BranchDetails implements Serializable {
	
	private int id ;
	private String internalBranchId ;
	private String description ;
	private int groupId ;
	private String addrLine1 ;
	private String addrLine2 ;
	private String town ;
	private String postCode ;
	private int countyCode ;
	private String telephoneNo ;
	private String faxNo ;
	private int workingDay ;
	private boolean isActive ;
	private String notes ;
	private Date startDate ;
	private Date endDate ;
	private String createdBy ;
	private Date createdDate ;
	private String updatedBy ;
	private Date updatedDate ;
	
	public BranchDetails() {
		this.id = 0;
		this.internalBranchId = null;
		this.description = null;
		this.groupId = 0;
		this.addrLine1 = null;
		this.addrLine2 = null;
		this.town = null;
		this.postCode = null;
		this.countyCode = 0;
		this.telephoneNo = null;
		this.faxNo = null;
		this.workingDay = 0;
		this.isActive = false;
		this.notes = null;
		this.startDate = null;
		this.endDate = null;
		this.createdBy = null;
		this.createdDate = null;
		this.updatedBy = null;
		this.updatedDate = null;
	}
	
	/**
	 * @param id
	 * @param internalBranchId
	 * @param description
	 * @param groupId
	 * @param addrLine1
	 * @param addrLine2
	 * @param town
	 * @param postCode
	 * @param countyCode
	 * @param telephoneNo
	 * @param faxNo
	 * @param workingDay
	 * @param isActive
	 * @param notes
	 * @param startDate
	 * @param endDate
	 * @param createdBy
	 * @param createdDate
	 * @param updatedBy
	 * @param updatedDate
	 */
	public BranchDetails(String internalBranchId
					   , String description
					   , int groupId
					   , String addrLine1
					   , String addrLine2
					   , String town
					   , String postCode
					   , int countyCode
					   , String telephoneNo
					   , String faxNo
					   , int workingDay
					   , boolean isActive
					   , String notes
					   , Date startDate
					   , Date endDate
					   , String createdBy
					   , Date createdDate
					   , String updatedBy
					   , Date updatedDate) {
		this.internalBranchId = internalBranchId;
		this.description = description;
		this.groupId = groupId;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.town = town;
		this.postCode = postCode;
		this.countyCode = countyCode;
		this.telephoneNo = telephoneNo;
		this.faxNo = faxNo;
		this.workingDay = workingDay;
		this.isActive = isActive;
		this.notes = notes;
		this.startDate = startDate;
		this.endDate = endDate;
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
	 * @return the internalBranchId
	 */
	public String getInternalBranchId() {
		return internalBranchId;
	}

	/**
	 * @param internalBranchId the internalBranchId to set
	 */
	public void setInternalBranchId(String internalBranchId) {
		this.internalBranchId = internalBranchId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the addrLine1
	 */
	public String getAddrLine1() {
		return addrLine1;
	}

	/**
	 * @param addrLine1 the addrLine1 to set
	 */
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	/**
	 * @return the addrLine2
	 */
	public String getAddrLine2() {
		return addrLine2;
	}

	/**
	 * @param addrLine2 the addrLine2 to set
	 */
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the countyCode
	 */
	public int getCountyCode() {
		return countyCode;
	}

	/**
	 * @param countyCode the countyCode to set
	 */
	public void setCountyCode(int countyCode) {
		this.countyCode = countyCode;
	}

	/**
	 * @return the telephoneNo
	 */
	public String getTelephoneNo() {
		return telephoneNo;
	}

	/**
	 * @param telephoneNo the telephoneNo to set
	 */
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	/**
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @return the workingDay
	 */
	public int getWorkingDay() {
		return workingDay;
	}

	/**
	 * @param workingDay the workingDay to set
	 */
	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
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
