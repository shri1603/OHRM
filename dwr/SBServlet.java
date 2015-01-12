/**
 * Title:		 ServiceBundleServlet
 * Description:  This component is used as controller for different actions related to service bundle management.
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
package itm.setup;

import itm.common.ITMConstants;
import itm.common.itmError;
import itm.common.itmErrorLogger;
import itm.dao.ServiceBundleDAO;
import itm.login.UserDetails;
import itm.manager.ServiceBundleManager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csid.sms.util.ccsv2.dto.BundleDTO;

/**
 * Servlet implementation class ServiceBundleServlet
 */
public class ServiceBundleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceBundleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServiceBundleManager manager = new ServiceBundleManager();
		String action = null;
		RequestDispatcher rd = null;
		BundleDTO bundleDTO = null;
		ServiceBundleDAO serviceBundleDao = null;
		boolean result;
		List<BundleDTO> existingBundles = null;
		HttpSession session = null;
		UserDetails currentUser = null;
		int editBundleId;
		try{
			action = request.getParameter("action");
			session = request.getSession();
			currentUser= (UserDetails) session.getAttribute("currentUser");
			if("loadBundles".equalsIgnoreCase(action)){
				
			}else if ("addBundle".equalsIgnoreCase(action)){
				bundleDTO = new BundleDTO();
				if(null != request.getParameter("bundleCode")){
					bundleDTO.setBundleCode(request.getParameter("bundleCode").trim());
				}
				if(null != request.getParameter("bundleDesc")){
					bundleDTO.setDescription(manager.formatDescription(request.getParameter("bundleDesc")));
				}
				bundleDTO.setBundleType(request.getParameter("bundleType"));
				bundleDTO.setServicesFromUI(request.getParameterValues("services"));
				result = manager.validateAndSaveBundle(bundleDTO, currentUser.getLoginName());
				if(!result){
					request.setAttribute("errorMessage", 
							null != bundleDTO.getErrorMessage() ? bundleDTO.getErrorMessage() : ITMConstants.TECHNICAL_ERROR);
					request.setAttribute("bundle", bundleDTO);
				}
				else{
					request.setAttribute("errorMessage", ITMConstants.BUNDLE_ADD_SUCCESS);
				}
			}else if("editBundle".equalsIgnoreCase(action)){
				editBundleId = Integer.parseInt(request.getParameter("editBundleId"));
				bundleDTO = manager.fetchBundleDetails(editBundleId);
				request.setAttribute("bundle", bundleDTO);
				request.setAttribute("editFlag", true);
				
			}else if("updateBundle".equalsIgnoreCase(action)){
				bundleDTO = new BundleDTO();
				bundleDTO.setBundleCode(request.getParameter("bundleCodeEdit"));
				bundleDTO.setBundleType(request.getParameter("bundleTypeEdit"));
				bundleDTO.setBundleId(Integer.parseInt(request.getParameter("editBundleId")));
				if(null != request.getParameter("bundleDesc")){
					bundleDTO.setDescription(manager.formatDescription(request.getParameter("bundleDesc")));
				}
				bundleDTO.setServicesFromUI(request.getParameterValues("services"));
				result = manager.validateAndUpdateBundle(bundleDTO, currentUser.getLoginName());
				if(!result){
					request.setAttribute("errorMessage", 
							null != bundleDTO.getErrorMessage() ? bundleDTO.getErrorMessage() : ITMConstants.TECHNICAL_ERROR);
					request.setAttribute("bundle", bundleDTO);
					request.setAttribute("editFlag", true);
				}
				else{
					request.setAttribute("errorMessage", ITMConstants.BUNDLE_UPDATE_SUCCESS);
				}
			}else if("deleteBundle".equalsIgnoreCase(action)){
				result = manager.deleteBundle(Integer.parseInt(request.getParameter("editBundleId")));
				if(!result){
					request.setAttribute("errorMessage", ITMConstants.TECHNICAL_ERROR);
				}else{
					request.setAttribute("errorMessage", ITMConstants.BUNDLE_DELETE_SUCCESS);
				}
			}
			serviceBundleDao = new ServiceBundleDAO();
			existingBundles = serviceBundleDao.fetchExistingBundles();
			request.setAttribute("existingBundles", existingBundles);
			request.setAttribute("existingBundlesSize", existingBundles.size());
			
			rd = request.getRequestDispatcher("/ServiceBundleManagement.jsp");
			rd.forward(request, response);
		}catch(Exception e){
			new itmError(e, null != currentUser? currentUser.getLoginName() : "", 7443, "ServiceBundleServlet", 
					itmErrorLogger.ADMIN, "Error in doPost() method.");
			rd = request.getRequestDispatcher("/errordisplay.jsp");
			rd.forward(request, response);
		}
	}
}
