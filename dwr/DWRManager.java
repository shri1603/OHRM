/**
 * Title:		 DWRManager
 * Description:  This component is used as manager for different asynchronous actions.
 * Copyright:    Copyright (c) 2004 PremaBiz Solutions, LLC.
 * @version 02.04_00
 *
 * Licensed under the PremaBiz Solutions, LLC License,(the "License") .
 * You may not use this file except in strict compliance with the License.
 * This notice may not be removed from this file.
 **/
/**
 ******************MODIFICATION HISTORY*****************************
 *Date	  |	Allocation No.	|		Purpose
 *------------------------------------------------------------------
 *
 *------------------------------------------------------------------
 **/
package itm.manager;

import itm.common.itmErrorLogger;
import itm.dao.ServiceBundleDAO;

import java.util.List;

import com.csid.sms.util.cache.vo.CreditUnionVO;
import com.csid.sms.util.ccsv2.dto.ServiceDTO;
import com.csid.sms.util.creditunion.dao.CreditUnionDao;
import com.csid.sms.util.creditunion.dao.CreditUnionDaoImpl;
import com.csid.sms.util.errorlog.service.ErrorLogger;

public class DWRManager {

	public List<ServiceDTO> fetchServices(String serviceType){
		List<ServiceDTO> serviceList = null;
		ServiceBundleDAO serviceBundleDao = null;
		try{
			if("D".equalsIgnoreCase(serviceType)){
				serviceType = "S";//Delayed authentication bundles will have same services as subscription bundles
			}
			serviceBundleDao = new ServiceBundleDAO();
			serviceList = serviceBundleDao.fetchServicesFromType(serviceType);
		}catch(Exception e){
			ErrorLogger.getInstance().logError(e, "", 7582, "DWRManager", itmErrorLogger.ADMIN, "", "Exception in fetchServices") ;
		}
		return serviceList;
	}

	public boolean checkForBundleMapping(int bundleId){
		boolean result = false;
		ServiceBundleDAO serviceBundleDao = null;
		try{
			serviceBundleDao = new ServiceBundleDAO();
			result = serviceBundleDao.isMappingPresent(bundleId);
		}catch(Exception e){
			ErrorLogger.getInstance().logError(e, "", 7583, "DWRManager", itmErrorLogger.ADMIN, "", "Exception in checkForBundleMapping") ;
		}
		return result;
	}

	public List<CreditUnionVO> fetchCreditUnionsByAuthType(int authType) {
		List<CreditUnionVO> creditUnionVOList = null ;
		CreditUnionDao creditUnionDaoImpl = null ; 
		try {
			creditUnionDaoImpl = new CreditUnionDaoImpl() ;
			creditUnionVOList = creditUnionDaoImpl.getCreditUnionDtlsByAuthType(authType) ;
		}catch(Exception e){
			ErrorLogger.getInstance().logError(e, "", 7626, "DWRManager", itmErrorLogger.ADMIN, "", "Exception in fetchCreditUnionsByAuthType") ;
		}
		return creditUnionVOList ;
	}
}
