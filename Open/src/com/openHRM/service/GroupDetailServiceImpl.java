/**
 * 
 */
package com.openHRM.service;

import java.util.List;

import com.openHRM.dao.GroupDetailsDaoImpl;
import com.openHRM.pojo.GroupDetails;
import com.openHRM.util.OpenHRMLogger;

/**
 * @author fpanchal
 *
 */
public class GroupDetailServiceImpl implements GroupDetailService {

	private static final OpenHRMLogger LOGGER = new OpenHRMLogger(GroupDetailServiceImpl.class) ;
	private static GroupDetailService groupDetailService = null ;
	
	
	/* (non-Javadoc)
	 * @see com.openHRM.module.group.service.GroupDetailService#fetchGroupDetailsUsingId()
	 */
	@Override
	public List<GroupDetails> fetchAllGroupDetails() throws Exception {
		List<GroupDetails> lstGroupDetail = null ;
		
		try {
			lstGroupDetail = GroupDetailsDaoImpl.getInstance().fetchAllGroupDetails() ; 
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		return lstGroupDetail ;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.service.GroupDetailService#fetchGroupDetailsUsingId(int)
	 */
	@Override
	public GroupDetails fetchGroupDetailsUsingId(int groupId) throws Exception {
		GroupDetails groupDetail = null ;
		
		try {
			groupDetail = GroupDetailsDaoImpl.getInstance().fetchGroupDetailsUsingId(groupId) ; 
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		return groupDetail ; 
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.service.GroupDetailService#addGroupDetail(com.openHRM.pojo.GroupDetails)
	 */
	@Override
	public boolean addGroupDetail(GroupDetails groupDetail) throws Exception {
		boolean isAddSuccess = Boolean.FALSE ;
		
		try {
			isAddSuccess = GroupDetailsDaoImpl.getInstance().addGroupDetail(groupDetail) ;
		}
		catch(Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		return isAddSuccess;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.service.GroupDetailService#deleteGroupPermenantlyFromDB(int)
	 */
	@Override
	public boolean deleteGroupPermenantlyFromDB(int groupId) throws Exception {
		boolean isDeleteSuccess = Boolean.FALSE ;
		
		try {
			isDeleteSuccess = GroupDetailsDaoImpl.getInstance().deleteGroupPermenantlyFromDB(groupId) ;
		}
		catch(Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		return isDeleteSuccess;
	}

	/*
	 * Singleton reference
	 */
	public static GroupDetailService getInstance() {
		
		if(null == groupDetailService) {
			groupDetailService = new GroupDetailServiceImpl() ;
		}
		
		return groupDetailService ;
	}
}
