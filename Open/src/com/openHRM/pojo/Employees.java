/**
 * 
 */
package com.openHRM.pojo;

import java.util.Date;

/**
 * @author fpanchal
 *
 */
public class Employees {
	
	private int id ;
	private String employeeId ;
	private String fristName ;
	private String middleName ;
	private String lastName ;
	private String nickName ;
	private Date dob ;
	private int nationality ;
	private int gender ;
	private int maritalStatus ;
	private int employmentStatus ;
	private String niNum ;
	private String otherId ;
	private String drivingLicenseNum ;
	private Date drivingLicenseExpDate ;
	private int jobTitle ;
	private int salGrdCode ;
	private String addrLine1 ;
	private String addrLine2 ;
	private String town ;
	private String postCode ;
	private int countyCode ;
	private String homePhone ;
	private String mobilePhone ;
	private String workPhone ;
	private String workEmail ;
	private String privateEmail ;
	private Date joinedDate ;
	private Date confirmationDate ;
	private int empMrgId ;
	private int deptId ;
	private String custom1 ;
	private String custom2 ;
	private String custom3 ;
	private String custom4 ;
	private String custom5 ;
	private String custom6 ;
	private String custom7 ;
	private String custom8 ;
	private String custom9 ;
	private String custom10 ;
	
	public Employees() {
		this.id = 0;
		this.employeeId = null;
		this.fristName = null;
		this.middleName = null;
		this.lastName = null;
		this.nickName = null;
		this.dob = null;
		this.nationality = 0;
		this.gender = 0;
		this.maritalStatus = 0;
		this.employmentStatus = 0;
		this.niNum = null;
		this.otherId = null;
		this.drivingLicenseNum = null;
		this.drivingLicenseExpDate = null;
		this.jobTitle = 0;
		this.salGrdCode = 0;
		this.addrLine1 = null;
		this.addrLine2 = null;
		this.town = null;
		this.postCode = null;
		this.countyCode = 0;
		this.homePhone = null;
		this.mobilePhone = null;
		this.workPhone = null;
		this.workEmail = null;
		this.privateEmail = null;
		this.joinedDate = null;
		this.confirmationDate = null;
		this.empMrgId = 0;
		this.deptId = 0;
		this.custom1 = null;
		this.custom2 = null;
		this.custom3 = null;
		this.custom4 = null;
		this.custom5 = null;
		this.custom6 = null;
		this.custom7 = null;
		this.custom8 = null;
		this.custom9 = null;
		this.custom10 = null;
	}
	/**
	 * @param id
	 * @param employeeId
	 * @param fristName
	 * @param middleName
	 * @param lastName
	 * @param nickName
	 * @param dob
	 * @param nationality
	 * @param gender
	 * @param maritalStatus
	 * @param employmentStatus
	 * @param niNum
	 * @param otherId
	 * @param drivingLicenseNum
	 * @param drivingLicenseExpDate
	 * @param jobTitle
	 * @param salGrdCode
	 * @param addrLine1
	 * @param addrLine2
	 * @param town
	 * @param postCode
	 * @param countyCode
	 * @param homePhone
	 * @param mobilePhone
	 * @param workPhone
	 * @param workEmail
	 * @param privateEmail
	 * @param joinedDate
	 * @param confirmationDate
	 * @param empMrgId
	 * @param deptId
	 * @param custom1
	 * @param custom2
	 * @param custom3
	 * @param custom4
	 * @param custom5
	 * @param custom6
	 * @param custom7
	 * @param custom8
	 * @param custom9
	 * @param custom10
	 */
	public Employees(String employeeId
				   , String fristName
				   , String middleName
				   , String lastName
				   , String nickName
				   , Date dob
				   , int nationality
				   , int gender
				   , int maritalStatus
				   , int employmentStatus
				   , String niNum
				   , String otherId
				   , String drivingLicenseNum
				   , Date drivingLicenseExpDate
				   , int jobTitle
				   , int salGrdCode
				   , String addrLine1
				   , String addrLine2
				   , String town
				   , String postCode
				   , int countyCode
				   , String homePhone
				   , String mobilePhone
				   , String workPhone
				   , String workEmail
				   , String privateEmail
				   , Date joinedDate
				   , Date confirmationDate
				   , int empMrgId
				   , int deptId
				   , String custom1
				   , String custom2
				   , String custom3
				   , String custom4
				   , String custom5
				   , String custom6
				   , String custom7
				   , String custom8
				   , String custom9
				   , String custom10) {
		this.employeeId = employeeId;
		this.fristName = fristName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.dob = dob;
		this.nationality = nationality;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.employmentStatus = employmentStatus;
		this.niNum = niNum;
		this.otherId = otherId;
		this.drivingLicenseNum = drivingLicenseNum;
		this.drivingLicenseExpDate = drivingLicenseExpDate;
		this.jobTitle = jobTitle;
		this.salGrdCode = salGrdCode;
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.town = town;
		this.postCode = postCode;
		this.countyCode = countyCode;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.workEmail = workEmail;
		this.privateEmail = privateEmail;
		this.joinedDate = joinedDate;
		this.confirmationDate = confirmationDate;
		this.empMrgId = empMrgId;
		this.deptId = deptId;
		this.custom1 = custom1;
		this.custom2 = custom2;
		this.custom3 = custom3;
		this.custom4 = custom4;
		this.custom5 = custom5;
		this.custom6 = custom6;
		this.custom7 = custom7;
		this.custom8 = custom8;
		this.custom9 = custom9;
		this.custom10 = custom10;
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
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the fristName
	 */
	public String getFristName() {
		return fristName;
	}
	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the nationality
	 */
	public int getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(int nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	/**
	 * @return the maritalStatus
	 */
	public int getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the employmentStatus
	 */
	public int getEmploymentStatus() {
		return employmentStatus;
	}
	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public void setEmploymentStatus(int employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	/**
	 * @return the niNum
	 */
	public String getNiNum() {
		return niNum;
	}
	/**
	 * @param niNum the niNum to set
	 */
	public void setNiNum(String niNum) {
		this.niNum = niNum;
	}
	/**
	 * @return the otherId
	 */
	public String getOtherId() {
		return otherId;
	}
	/**
	 * @param otherId the otherId to set
	 */
	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}
	/**
	 * @return the drivingLicenseNum
	 */
	public String getDrivingLicenseNum() {
		return drivingLicenseNum;
	}
	/**
	 * @param drivingLicenseNum the drivingLicenseNum to set
	 */
	public void setDrivingLicenseNum(String drivingLicenseNum) {
		this.drivingLicenseNum = drivingLicenseNum;
	}
	/**
	 * @return the drivingLicenseExpDate
	 */
	public Date getDrivingLicenseExpDate() {
		return drivingLicenseExpDate;
	}
	/**
	 * @param drivingLicenseExpDate the drivingLicenseExpDate to set
	 */
	public void setDrivingLicenseExpDate(Date drivingLicenseExpDate) {
		this.drivingLicenseExpDate = drivingLicenseExpDate;
	}
	/**
	 * @return the jobTitle
	 */
	public int getJobTitle() {
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(int jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * @return the salGrdCode
	 */
	public int getSalGrdCode() {
		return salGrdCode;
	}
	/**
	 * @param salGrdCode the salGrdCode to set
	 */
	public void setSalGrdCode(int salGrdCode) {
		this.salGrdCode = salGrdCode;
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
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}
	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the workPhone
	 */
	public String getWorkPhone() {
		return workPhone;
	}
	/**
	 * @param workPhone the workPhone to set
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	/**
	 * @return the workEmail
	 */
	public String getWorkEmail() {
		return workEmail;
	}
	/**
	 * @param workEmail the workEmail to set
	 */
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	/**
	 * @return the privateEmail
	 */
	public String getPrivateEmail() {
		return privateEmail;
	}
	/**
	 * @param privateEmail the privateEmail to set
	 */
	public void setPrivateEmail(String privateEmail) {
		this.privateEmail = privateEmail;
	}
	/**
	 * @return the joinedDate
	 */
	public Date getJoinedDate() {
		return joinedDate;
	}
	/**
	 * @param joinedDate the joinedDate to set
	 */
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	/**
	 * @return the confirmationDate
	 */
	public Date getConfirmationDate() {
		return confirmationDate;
	}
	/**
	 * @param confirmationDate the confirmationDate to set
	 */
	public void setConfirmationDate(Date confirmationDate) {
		this.confirmationDate = confirmationDate;
	}
	/**
	 * @return the empMrgId
	 */
	public int getEmpMrgId() {
		return empMrgId;
	}
	/**
	 * @param empMrgId the empMrgId to set
	 */
	public void setEmpMrgId(int empMrgId) {
		this.empMrgId = empMrgId;
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the custom1
	 */
	public String getCustom1() {
		return custom1;
	}
	/**
	 * @param custom1 the custom1 to set
	 */
	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}
	/**
	 * @return the custom2
	 */
	public String getCustom2() {
		return custom2;
	}
	/**
	 * @param custom2 the custom2 to set
	 */
	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}
	/**
	 * @return the custom3
	 */
	public String getCustom3() {
		return custom3;
	}
	/**
	 * @param custom3 the custom3 to set
	 */
	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}
	/**
	 * @return the custom4
	 */
	public String getCustom4() {
		return custom4;
	}
	/**
	 * @param custom4 the custom4 to set
	 */
	public void setCustom4(String custom4) {
		this.custom4 = custom4;
	}
	/**
	 * @return the custom5
	 */
	public String getCustom5() {
		return custom5;
	}
	/**
	 * @param custom5 the custom5 to set
	 */
	public void setCustom5(String custom5) {
		this.custom5 = custom5;
	}
	/**
	 * @return the custom6
	 */
	public String getCustom6() {
		return custom6;
	}
	/**
	 * @param custom6 the custom6 to set
	 */
	public void setCustom6(String custom6) {
		this.custom6 = custom6;
	}
	/**
	 * @return the custom7
	 */
	public String getCustom7() {
		return custom7;
	}
	/**
	 * @param custom7 the custom7 to set
	 */
	public void setCustom7(String custom7) {
		this.custom7 = custom7;
	}
	/**
	 * @return the custom8
	 */
	public String getCustom8() {
		return custom8;
	}
	/**
	 * @param custom8 the custom8 to set
	 */
	public void setCustom8(String custom8) {
		this.custom8 = custom8;
	}
	/**
	 * @return the custom9
	 */
	public String getCustom9() {
		return custom9;
	}
	/**
	 * @param custom9 the custom9 to set
	 */
	public void setCustom9(String custom9) {
		this.custom9 = custom9;
	}
	/**
	 * @return the custom10
	 */
	public String getCustom10() {
		return custom10;
	}
	/**
	 * @param custom10 the custom10 to set
	 */
	public void setCustom10(String custom10) {
		this.custom10 = custom10;
	}
}
