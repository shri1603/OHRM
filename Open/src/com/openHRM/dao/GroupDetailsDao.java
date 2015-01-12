/**
 * 
 */
package com.openHRM.dao;

import java.util.List;

import com.openHRM.pojo.GroupDetails;

/**
 * @author fpanchal
 *
 */
public interface GroupDetailsDao {

	public List<GroupDetails> fetchAllGroupDetails() throws Exception ;
	public GroupDetails fetchGroupDetailsUsingId(int groupId) throws Exception ;
	public boolean addGroupDetail(GroupDetails groupDetail) throws Exception ;
	public boolean editGroupDetail(GroupDetails groupDetail) throws Exception ;
	public boolean markGroupAsInActive(int groupId) throws Exception ;
	public boolean deleteGroupPermenantlyFromDB(int groupId) throws Exception ;
	
}
