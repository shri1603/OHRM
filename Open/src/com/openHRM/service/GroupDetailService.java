/**
 * 
 */
package com.openHRM.service;

import java.util.List;

import com.openHRM.pojo.GroupDetails;

/**
 * @author fpanchal
 *
 */
public interface GroupDetailService {
	
	public List<GroupDetails> fetchAllGroupDetails() throws Exception ;
	public GroupDetails fetchGroupDetailsUsingId(int groupId) throws Exception ;
	public boolean addGroupDetail(GroupDetails groupDetail) throws Exception ;
	public boolean deleteGroupPermenantlyFromDB(int groupId) throws Exception ;
}
