<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>
<%@ include file="checkrelogin.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Service Bundle Management</title>
<meta http-equiv="content-type" content="text/html; charset=us-ascii">
<meta http-equiv="X-UA-Compatible" content="IE=9">
<script language="javascript" src="js/clientscr.js" type="text/javascript"></script>
<script language="javascript" src='dwr/engine.js'></script>
<script language="javascript" src='dwr/util.js'></script>
<script language="javascript" src='dwr/interface/Filter.js'></script>
<script language="javascript" src="js/bundleMgmt.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/itm.css">
<link rel="shortcut icon" type="image/x-icon" href="http://www.csid.com/wp-content/themes/csid/favicon.ico" />
</head>
<body style="margin: 0px;">
<span id="help" class="hoverhelp">
This page allows the user to access the following services of bundle management:
<ul>
<li>Add a new Bundle</li>
<li>Edit Bundle</li>
<li>Map services to a Bundle</li>
<li>Delete Bundle</li>
</ul>

Please refer to the User Guide for further information.  
</span>

<div align="center">
<form id='addBundleForm' name="addBundleForm" method="post" action="ServiceBundleServlet">
	<%@ include file="usertopmenu.jsp"%>
	
	<table cellpadding="0" cellspacing="0" width="780" height="450">
		<tbody>
		    <tr>
		        <td width="20%" class="menuleft" rowspan="2" valign="top">
		            <br><a href="sbadmin.jsp">SB Admin</a><br>
		            
		        </td>
		        <td align="center" valign="top" width='80%'><br>
		            <c:choose>
		            	<c:when test="${editFlag}">
		            		<h2 align='center'>Edit Service Bundle</h2>		
		            	</c:when>
		            	<c:otherwise>
		            		<h2 align='center'>Manage Service Bundles</h2>
		            	</c:otherwise>
		            </c:choose>
		        	<div id="errMsg" class="errorMessage">${errorMessage}</div>
		        	<!-- TRINITY-1501.I.B -->
		        	<div id="authNote" style="display: none;">
		        		Note:&nbsp;No service is associated with Authentication bundle type.
		        	</div>
		        	<div id="authConfig" class="errorMessage" style="display: none;">
			        	Authentication Bundle is already configured.
		        	</div>
		        	<!-- TRINITY-1501.I.E -->
	        		<input type="hidden" id="action" name="action"/>
	        		<table cellspacing="2" cellpadding="2" width="100%" >
		            	<tr>
		            		<td width="50%">
		            			<table cellspacing="2" cellpadding="2" width="100%">
		            				<tr>
		            					<td align='right' valign="middle" class='FieldLabel'>Bundle Code&nbsp;:&nbsp;</td>
		            					<td>
		            						<c:choose>
	            								<c:when test="${editFlag}">
	            									<c:choose>
	            										<c:when test="${bundle.bundleType eq 'A'}">
			            									<input type="text" name="bundleCodeEdit" size="28" maxlength="100"
							                                	   value="${bundle.bundleCode}" id="bundleCodeEdit">	
	            										</c:when>
	            										<c:otherwise>
			            									${bundle.bundleCode}
			            									<input type="hidden" name="bundleCodeEdit" value="${bundle.bundleCode}"/>
	            										</c:otherwise>
	            									</c:choose>
	            									<input type="hidden" name="bundleTypeEdit" value="${bundle.bundleType}"/>
	            								</c:when>
	            								<c:otherwise>
	            									<input	
					                                type="text"
					                                name="bundleCode"
					                                size="28"
					                                maxlength="100"
					                                value="${bundle.bundleCode}" 
					                                id="bundleCode">	
	            								</c:otherwise>
	            							</c:choose>
		            						
		            					</td>
		            				</tr>
		            				<tr>
		            					<td align='right' valign="middle" class='FieldLabel'>Description&nbsp;:&nbsp;</td>
		            					<td>
		            						<textarea cols="27" rows="5" name="bundleDesc" class="FieldValue" style="vertical-align: top;" id="bundleDesc">${bundle.description}</textarea>
		            					</td>
		            				</tr>
		            				<tr>
		            					<td align='right' valign="middle" class='FieldLabel'>Bundle Type&nbsp;:&nbsp;</td>
		            					<td>
		            						<select style="width: 150px;" name="bundleType" id="bundleTypeId" onchange="fetchServices();"
		            							<c:if test="${editFlag}">disabled</c:if>>
		            							<option value="-1">&nbsp;</option>
		            							<option value="S" <c:if test="${bundle.bundleType eq 'S'}">selected</c:if>>Subscription</option>
		            							<option value="T" <c:if test="${bundle.bundleType eq 'T'}">selected</c:if>>Transactional</option>
		            							<option value="D" <c:if test="${bundle.bundleType eq 'D'}">selected</c:if>>Delayed Authentication</option>
		            							<option value="A" <c:if test="${bundle.bundleType eq 'A'}">selected</c:if>>Authentication</option> <!-- TRINITY-1501.I -->
		            						</select>
		            					</td>
		            				</tr>
		            			</table>
		            		</td>
		            			
		            		<td >
		            			<table cellspacing="2" cellpadding="2" width="100%" >
		            				<tr>
		            					<td align='right' valign="middle" class='FieldLabel'>Services&nbsp;:&nbsp;</td>
		            					<td>
		            						<select multiple="multiple" style="width: 200px;height: 150px;" name="services" id="services">
		            							<c:if test="${bundle.bundleType ne -1}">
		            								<c:forEach items="${bundle.services}" var="element">
		            									<option value="${element.serviceId}" 
		            									<c:if test="${element.selected}">selected</c:if>>
		            										${element.serviceName}
		            									</option>
		            								</c:forEach>
		            							</c:if>
		            						</select>
		            					</td>
		            				</tr>
		            			</table>
		            		</td>
		            	</tr>
		            	<tr>
		            		<td colspan="2" align="center">
		            			<c:choose>
		            				<c:when test="${editFlag}">
		            					<input class='ButtonStyle' type="button" value="Update" onclick="performAction('addBundleForm','updateBundle');">&nbsp;
		                        		<input class='ButtonStyle' type="button" value="Cancel" onclick="performAction('addBundleForm','loadBundles');">	
		            				</c:when>
		            				<c:otherwise>
		            					<input class='ButtonStyle' type="button" value=" Add " onclick="performAction('addBundleForm','addBundle');" id="addBtn">&nbsp;
		                        		<input class='ButtonStyle' type="button" value="Cancel" onclick="backToSBAdmin('addBundleForm');">
		            				</c:otherwise>
		            			</c:choose>
		            			
		                        <input type="hidden" name="editBundleId" id="editBundleId" value="${bundle.bundleId}"/>
		            		</td>
		            	</tr>
		            </table>
		            <br />
		            <table style="width: 100%">
		            	<tr>
           					<th colspan="5">Existing Bundles</th>
           				</tr>
		            	<tr>
		            		<th width="20%">Bundle Code</th>
		            		<th width="25%">Description</th>
		            		<th width="15%">Bundle Type</th>
		            		<th width="30%">Services</th>
		            		<th width="10%">Action</th>
		            	</tr>
		            	<c:choose>
	            			<c:when test="${existingBundlesSize eq 0}">
	            				<tr>
	            					<td colspan="5" align="center"><b>No Bundle(s) found.</b></td>
	            				</tr>
	            			</c:when>
	            			<c:otherwise>
	            				<c:forEach items="${existingBundles}" var="bundle">
	            					<tr>
		            					<td><div style="word-break : break-all;">${bundle.bundleCode}</div></td>
		            					<td><div style="word-break : break-all;">${bundle.description}</div></td>
		            					<td>
		            						<div style="word-break : break-all;">${bundle.bundleType}</div>
		            					</td>
		            					<td><div style="word-break : break-all;">${bundle.servicesText}</div></td>
		            					<td align="center">
		            						<img src="assets/edit.png" style="cursor: hand;" title="Edit"
		            							 onclick="editBundle(${bundle.bundleId});"/>&nbsp;
											<c:choose>
			            						<c:when test="${bundle.authBundleCodeExists == true}">
			            							<img src="assets/cancel.png" style="cursor: hand;" title="Delete" onclick="alert('Authentication Bundle is only editable.');"/>
			            							<script>authBundleExists = true ;</script>
			            						</c:when>
			            						<c:otherwise>
		            								<img src="assets/cancel.png" style="cursor: hand;" title="Delete" onclick="deleteBundle(${bundle.bundleId});"/>
			            						</c:otherwise>
											</c:choose>
		            					</td>
	            					</tr>
	            				</c:forEach>
	            			</c:otherwise>
	            		</c:choose>
		            </table>
		        </td>
		    </tr>
		</tbody>
	</table> 
</form>
</div>
</body>
</html>