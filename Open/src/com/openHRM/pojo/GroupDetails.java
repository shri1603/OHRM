/**
 * 
 */
package com.openHRM.pojo;

import java.util.Date;

/**
 * @author fpanchal
 *
 */
public class GroupDetails {

	private int id ;
	private String description ;
	private String addrLine1 ;
	private String addrLine2 ;
	private String town ;
	private String postCode ;
	private int countyCode ;
	private String telephoneNo ;
	private String faxNo ;
	private boolean isActive ;
	private String customField1 ;
	private String customField2 ;
	private String customField3 ;
	private String customField4 ;
	private String customField5 ;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    
    public GroupDetails() {
    	this.id = 0;
    	this.description = null;
    	this.addrLine1 = null;
    	this.addrLine2 = null;
    	this.town = null;
    	this.postCode = null;
    	this.countyCode = 0;
    	this.telephoneNo = null;
    	this.faxNo = null;
    	this.isActive = false;
    	this.customField1 = null;
    	this.customField2 = null;
    	this.customField3 = null;
    	this.customField4 = null;
    	this.customField5 = null;
    	this.createdBy = null;
    	this.createdDate = null;
    	this.updatedBy = null;
    	this.updatedDate = null;
    }  
    
	/**
	 * @param id
	 * @param description
	 * @param addrLine1
	 * @param addrLine2
	 * @param town
	 * @param postCode
	 * @param countyCode
	 * @param telephoneNo
	 * @param faxNo
	 * @param isActive
	 * @param customField1
	 * @param customField2
	 * @param customField3
	 * @param customField4
	 * @param customField5
	 * @param createdBy
	 * @param createdDate
	 * @param updatedBy
	 * @param updatedDate
	 */
	public GroupDetails(String description
					  , String addrLine1
					  , String addrLine2
					  , String town
					  , String postCode
					  , int countyCode
					  , String telephoneNo
					  , String faxNo
					  , boolean isActive
					  , String customField1
					  , String customField2
					  , String customField3
					  , String customField4
					  , String customField5
					  , String createdBy
					  , Date createdDate
					  , String updatedBy
					  , Date updatedDate) {
		this.description = description;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.town = town;
		this.postCode = postCode;
		this.countyCode = countyCode;
		this.telephoneNo = telephoneNo;
		this.faxNo = faxNo;
		this.isActive = isActive;
		this.customField1 = customField1;
		this.customField2 = customField2;
		this.customField3 = customField3;
		this.customField4 = customField4;
		this.customField5 = customField5;
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
	 * @return the customField1
	 */
	public String getCustomField1() {
		return customField1;
	}
	/**
	 * @param customField1 the customField1 to set
	 */
	public void setCustomField1(String customField1) {
		this.customField1 = customField1;
	}
	/**
	 * @return the customField2
	 */
	public String getCustomField2() {
		return customField2;
	}
	/**
	 * @param customField2 the customField2 to set
	 */
	public void setCustomField2(String customField2) {
		this.customField2 = customField2;
	}
	/**
	 * @return the customField3
	 */
	public String getCustomField3() {
		return customField3;
	}
	/**
	 * @param customField3 the customField3 to set
	 */
	public void setCustomField3(String customField3) {
		this.customField3 = customField3;
	}
	/**
	 * @return the customField4
	 */
	public String getCustomField4() {
		return customField4;
	}
	/**
	 * @param customField4 the customField4 to set
	 */
	public void setCustomField4(String customField4) {
		this.customField4 = customField4;
	}
	/**
	 * @return the customField5
	 */
	public String getCustomField5() {
		return customField5;
	}
	/**
	 * @param customField5 the customField5 to set
	 */
	public void setCustomField5(String customField5) {
		this.customField5 = customField5;
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
	
	@Override
	public String toString() {
		
		return new StringBuilder("Group Id : ").append(this.id)
				   .append(", Group Desc : ").append(this.description)
				   .append(", Address Line1 : ").append(this.addrLine1)
				   .append(", Address Line2 : ").append(this.addrLine2) 
				   .append(", Town : ").append(this.town)
				   .append(", Postcode : ").append(this.postCode)
				   .append(", County Code : ").append(this.countyCode) 
				   .append(", Telephone : ").append(this.telephoneNo)
				   .append(", Fax No : ").append(this.faxNo)
				   .append(", Active : ").append(this.isActive) 
				   .append(", Created By : ").append(this.createdBy)
				   .append(", Created Date : ").append(this.createdDate)
				   .append(", Updated By : ").append(this.updatedBy)
				   .append(", Updated Date : ").append(this.updatedDate).toString() ;
	}
}
