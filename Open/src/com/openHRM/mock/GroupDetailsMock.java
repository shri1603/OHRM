/**
 * 
 */
package com.openHRM.mock;

import java.util.Date;
import java.util.List;

import com.openHRM.pojo.GroupDetails;
import com.openHRM.service.GroupDetailServiceImpl;

/**
 * @author fpanchal
 *
 */
public class GroupDetailsMock {

	public void fetchAllGroupDetails() {
		List<GroupDetails> lstGroupDetails = null ;
		
		try {
			lstGroupDetails = GroupDetailServiceImpl.getInstance().fetchAllGroupDetails() ;
			
			for(GroupDetails groupDetail : lstGroupDetails) {
				System.out.println(groupDetail.toString());
			}
		}
		catch (Exception ex) {
			ex.printStackTrace() ;
		}
	}
	
	public void fetchGroupDetailUsingId(int groupId) {

		GroupDetails groupDetail = null ;

		try {
			groupDetail = GroupDetailServiceImpl.getInstance().fetchGroupDetailsUsingId(groupId) ;
			System.out.println(groupDetail.toString());
		}
		catch (Exception ex) {
			ex.printStackTrace() ;
		}
	}
	
	public int addGroupDetails() {
		GroupDetails groupDetail = null ;
		boolean isAddSuccess = Boolean.FALSE ;
		int groupDetailId = 0 ;
		
		try{
			groupDetail = new GroupDetails("Test Group"
										 , "Test Addr1"
										 , "Test Addr2"
										 , "TestTown"
										 , "C123 B12"
										 , 2
										 , "111 222222"
										 , "111 222222"
										 , Boolean.FALSE
										 , null
										 , null
										 , null
										 , null
										 , null
										 , "Mock Test"
										 , new Date()
										 , null
										 , null) ;

			isAddSuccess = GroupDetailServiceImpl.getInstance().addGroupDetail(groupDetail) ;
			System.out.println("Group Added Successfully ? " + isAddSuccess);
			if(isAddSuccess) {
				System.out.println(groupDetail.toString());
				groupDetailId = groupDetail.getId() ;
			}
		}
		catch (Exception ex) {
			ex.printStackTrace() ;
		}
		return groupDetailId ;
	}
	
	public void deleteGroupDetail(int groupId) {
		
		try {
			GroupDetailServiceImpl.getInstance().deleteGroupPermenantlyFromDB(groupId) ;
			System.out.println("Group Deleted successfully from DB...");
		}
		catch (Exception ex) {
			ex.printStackTrace() ;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int groupId = 0 ;
		
		try {
			
			GroupDetailsMock groupDtlMock = new GroupDetailsMock() ;
			
			groupDtlMock.fetchAllGroupDetails() ;
			
			groupDtlMock.fetchGroupDetailUsingId(1) ;
			
			groupId = groupDtlMock.addGroupDetails() ;
			
			if(groupId > 0) {
				groupDtlMock.deleteGroupDetail(groupId) ;
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace() ;
		}
	}

}
