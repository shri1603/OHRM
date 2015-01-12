/**
 * 
 */
package com.openHRM.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.openHRM.pojo.GroupDetails;
import com.openHRM.util.HibernateSessionFactory;
import com.openHRM.util.OpenHRMLogger;

/**
 * @author fpanchal
 *
 */
public class GroupDetailsDaoImpl implements GroupDetailsDao {

	private static GroupDetailsDao groupDetailsDao = null ;
	private static final OpenHRMLogger LOGGER = new OpenHRMLogger(GroupDetailsDaoImpl.class) ;
	
	
	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#fetchAllGroupDetails()
	 */
	@Override
	public List<GroupDetails> fetchAllGroupDetails() throws Exception {
		Session hbnSession = null ;
		List<GroupDetails> lstGroupDetails = null ;
		
		try {
			hbnSession = HibernateSessionFactory.getSession() ;
			lstGroupDetails = (List<GroupDetails>) hbnSession.createQuery("from GroupDetails").list() ;
		}
		catch(Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		finally {
			HibernateSessionFactory.closeSession() ;
			hbnSession = null ;
		}
		return lstGroupDetails;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#fetchGroupDetailsUsingId(int)
	 */
	@Override
	public GroupDetails fetchGroupDetailsUsingId(int groupId)  throws Exception {
		
		Session hbnSession = null ;
		GroupDetails groupDetail = null ;
		
		try {
			hbnSession = HibernateSessionFactory.getSession() ;
			groupDetail = (GroupDetails) hbnSession.get(com.openHRM.pojo.GroupDetails.class, groupId) ;
		}
		catch(Exception ex) {
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		finally {
			HibernateSessionFactory.closeSession() ;
			hbnSession = null ;
		}
		return groupDetail;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#addGroupDetail(com.openHRM.pojo.GroupDetails)
	 */
	@Override
	public boolean addGroupDetail(GroupDetails groupDetail) throws Exception {
		Session hbnSession = null ;
		Transaction hbnTx = null ;
		
		try {
			hbnSession = HibernateSessionFactory.getSession() ;
			hbnTx = hbnSession.getTransaction() ;
			hbnTx.begin() ;
			hbnSession.save(groupDetail) ;
			hbnTx.commit() ;
		}
		catch (Exception ex) {
			hbnTx.rollback() ;
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		finally {
			HibernateSessionFactory.closeSession() ;
			hbnTx = null ;
			hbnSession = null ;
		}
		return Boolean.TRUE ;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#editGroupDetail(com.openHRM.pojo.GroupDetails)
	 */
	@Override
	public boolean editGroupDetail(GroupDetails groupDetail) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#deleteGroupDetail(int)
	 */
	@Override
	public boolean markGroupAsInActive(int groupId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	

	/* (non-Javadoc)
	 * @see com.openHRM.module.group.dao.GroupDetailsDao#deleteGroupPermenantlyFromDB(int)
	 */
	@Override
	public boolean deleteGroupPermenantlyFromDB(int groupId) throws Exception {
		Session hbnSession = null ;
		Transaction hbnTx = null ;
		GroupDetails groupDetails = null ;
		boolean isDeleteSuccess = Boolean.FALSE ;
		
		try {
			groupDetails = fetchGroupDetailsUsingId(groupId) ;
			hbnSession = HibernateSessionFactory.getSession() ;
			hbnTx = hbnSession.getTransaction() ;
			hbnTx.begin() ;
			hbnSession.delete(groupDetails) ;
			hbnTx.commit() ;
			isDeleteSuccess = Boolean.TRUE ;
		}
		catch(Exception ex) {
			hbnTx.rollback() ;
			LOGGER.error(ex.getMessage()) ;
			throw ex ;
		}
		finally {
			HibernateSessionFactory.closeSession() ;
			hbnTx = null ;
			hbnSession = null ;
		}
		return isDeleteSuccess;
	}

	/*
	 * Singleton reference
	 */
	public static GroupDetailsDao getInstance() throws Exception {
		
		if(null == groupDetailsDao) {
			groupDetailsDao = new GroupDetailsDaoImpl() ;
		}
		
		return groupDetailsDao ;
	}
}
