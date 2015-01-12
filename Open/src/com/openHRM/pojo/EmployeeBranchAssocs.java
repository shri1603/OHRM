/**
 * 
 */
package com.openHRM.pojo;

/**
 * @author fpanchal
 *
 */
public class EmployeeBranchAssocs {

	private int id ;
	private int empId ;
	private int branchId ;
	private boolean isDefault ;
	
	public EmployeeBranchAssocs() {
		this.id = 0;
		this.empId = 0;
		this.branchId = 0;
		this.isDefault = false;
	}
	/**
	 * @param id
	 * @param empId
	 * @param branchId
	 * @param isDefault
	 */
	public EmployeeBranchAssocs(int empId
							  , int branchId
							  , boolean isDefault) {
		this.empId = empId;
		this.branchId = branchId;
		this.isDefault = isDefault;
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
	 * @return the isDefault
	 */
	public boolean isDefault() {
		return isDefault;
	}
	/**
	 * @param isDefault the isDefault to set
	 */
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
